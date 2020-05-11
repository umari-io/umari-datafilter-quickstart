import { Genre } from './enums/genre.enum';
import { Author } from './author';

export class Book {
	id: number;
	name: string;
	releaseYear: number;
	author: Author;
	genre: Genre;
}
