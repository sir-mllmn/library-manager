CREATE KEYSPACE librarykeyspace WITH REPLICATION = {'class': 'SimpleStrategy', 'replication_factor' : 1};

CREATE TABLE IF NOT EXISTS librarykeyspace.books(id int PRIMARY KEY, name text, year int, pages int);