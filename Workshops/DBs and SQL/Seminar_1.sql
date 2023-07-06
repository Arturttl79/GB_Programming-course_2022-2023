CREATE DATABASE works;

USE works;

CREATE TABLE workers
(id INT PRIMARY KEY NOT NULL,
name_worker VARCHAR(30) NOT NULL,
dept VARCHAR(30) NOT NULL,
salary INT);

SELECT * FROM workers;

INSERT INTO workers(id, name_worker, dept, salary)
VALUES
(100, "AndreyEX", "Sales", 5000),
(200, "Boris", "IT", 5500),
(300, "Anna", "IT", 7000),
(400, "Anton", "Marketing", 9500),
(500, "Dima", "IT", 6000),
(501, "Maxs", "Accounting", NULL);

SELECT * FROM workers
WHERE salary > 6000;

SELECT * FROM workers
WHERE dept = 'IT';

SELECT * FROM workers
WHERE dept <> 'IT';

SELECT * FROM workers
WHERE dept != 'IT';

SELECT * FROM workers
WHERE dept NOT LIKE 'IT';

SELECT * FROM workers
WHERE NOT dept LIKE 'IT';