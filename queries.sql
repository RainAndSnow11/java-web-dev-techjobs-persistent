## Part 1: Test it with SQL

--Columns: id(int), employer(varchar), name(varchar), skills(varchar)
SELECT COLUMN_NAME, DATA_TYPE
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'job';

## Part 2: Test it with SQL
SELECT name
FROM techjobs.employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE techjobs.job;

## Part 4: Test it with SQL