INSERT INTO AUTHOR (ID, NAME, BIRTH_DATE, ALIVE) VALUES
    (1, 'E. E. Cummings', {ts '1894-10-14 00:00:00.00'}, false),
    (2, 'J. K. Rowling', {ts '1965-07-31 00:00:00.00'}, true),
    (3, 'Chimamanda Ngozi Adichie', {ts '1977-09-15 00:00:00.00'}, true);

INSERT INTO BOOK (ID, NAME, RELEASE_YEAR, AUTHOR_ID, GENRE) VALUES
    (1, 'Tulips and Chimneys', 1923, 1, 'POETRY'),
    (2, 'No Thanks', 1935, 1, 'POETRY'),
    (3, 'Fairy Tales', 1965, 1, 'FICTION'),
    (4, 'Harry Potter and the Philosopher''s Stone', 1997, 2, 'FICTION'),
    (5, 'Harry Potter and the Chamber of Secrets', 1998, 2, 'FICTION'),
    (6, 'Harry Potter and the Prisoner of Azkaban', 1999, 2, 'FICTION'),
    (7, 'Harry Potter and the Goblet of Fire', 2000, 2, 'FICTION'),
    (8, 'Harry Potter and the Order of the Phoenix', 2003, 2, 'FICTION'),
    (9, 'Harry Potter and the Half-Blood Prince', 2005, 2, 'FICTION'),
    (10, 'Harry Potter and the Deathly Hallows', 2007, 2, 'FICTION'),
    (11, 'The Casual Vacancy', 2012, 2, 'DRAMA'),
    (12, 'Purple Hibiscus', 2003, 3, 'DRAMA'),
    (13, 'Half of a Yellow Sun', 2006, 3, 'DRAMA'),
    (14, 'The Thing Around Your Neck', 2009, 3, 'DRAMA'),
    (15, 'Americanah', 2013, 3, 'DRAMA'),
    (16, 'We Should All Be Feminists', 2014, 3, 'NONFICTION'),
    (17, 'Dear Ijeawele, or A Feminist Manifesto in Fifteen Suggestions', 2017, 3, 'NONFICTION');