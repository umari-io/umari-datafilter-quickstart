import { Genre } from './../enums/genre.enum';

export class BookSummary {
	id: number;
	name: string;
	releaseYear: number;
	genre: Genre;
	authorId: number;
	authorName: string;
	authorBirthDate: Date;
	authorAlive: boolean;
}
