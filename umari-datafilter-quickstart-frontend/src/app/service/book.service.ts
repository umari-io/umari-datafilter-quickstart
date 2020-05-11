import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Page, UdfFilterable } from 'ng-umari-datafilter';

import { environment } from './../../environments/environment';
import { BookSummary } from './../domain/summary/book-summary';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private udfUrl: string = `${environment.urlbase}/udf/books`

  constructor(private httpClient: HttpClient) { }

  public filter(page: number = 0, size: number = 20, sort: string, filterable: UdfFilterable): Observable<Page<BookSummary>> {
    return this.httpClient.post<Page<BookSummary>>(`${this.udfUrl}/?page=${page}&size=${size}&sort=${sort}&date=${new Date('1900-01-01 00:00:00.00')}`, {'filterable' : filterable});
  }

}
