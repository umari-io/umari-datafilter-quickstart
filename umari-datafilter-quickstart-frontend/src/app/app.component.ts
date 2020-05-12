import { Component, OnInit } from '@angular/core';
import { take } from 'rxjs/operators';
import { UdfFilterable, Page, and, eq, or, not, lt, ne, gt, toFilterable, UdfAggregable, UdfAggregation } from 'ng-umari-datafilter'

import { BookSummary } from './domain/summary/book-summary';
import { BookService } from './service/book.service';
import { Genre } from './domain/enums/genre.enum';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit {

  filters: any[];
  filterable: UdfFilterable;
  page: Page<BookSummary>;

  aggFilters: any[];
  aggFilterable: UdfFilterable;
  aggregables: UdfAggregable[];
  aggregations: UdfAggregation[];

  constructor(
    private bookService: BookService
  ) { }

  ngOnInit(): void {
    this.filters = or(
      not(
        gt('authorBirthDate', new Date('1900-01-01 00:00:00.00'))
      ),
      and(
        eq('genre', [Genre.DRAMA, Genre.POETRY]),
        or(
          not(
            lt('releaseYear', 2013)
          ),
          ne('authorAlive', false)
        )
      )
    );
    this.filterable = toFilterable(this.filters);
    this.bookService.filter(0, 10, 'name', this.filterable)
      .pipe(take(1))
      .subscribe(page => this.page = page);

    this.aggFilters = eq('genre', [Genre.DRAMA, Genre.POETRY]);
    this.aggFilterable = toFilterable(this.aggFilters);
    this.aggregables = [{
      selector: 'id',
      operation: 'count'
    }, {
      selector: 'releaseYear',
      operation: 'min'
    }, {
      selector: 'releaseYear',
      operation: 'max'
    }];
    this.bookService.aggreate(this.aggFilterable, this.aggregables)
      .pipe(take(1))
      .subscribe(aggregations => this.aggregations = aggregations);
  }

}
