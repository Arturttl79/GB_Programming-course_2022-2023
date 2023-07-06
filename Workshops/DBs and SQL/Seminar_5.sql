DROP DATABASE IF EXISTS lesson_5;
CREATE DATABASE lesson_5;
USE lesson_5;

-- Персонал
DROP TABLE IF EXISTS staff;
CREATE TABLE staff (
id INT AUTO_INCREMENT PRIMARY KEY,
firstname VARCHAR(45),
lastname VARCHAR(45),
post VARCHAR(100),
seniority INT,
salary INT,
age INT
);

-- Наполнение данными
INSERT INTO staff (firstname, lastname, post, seniority, salary, age)
VALUES
('Вася', 'Петров', 'Начальник', '40', 100000, 60),
('Петр', 'Власов', 'Начальник', '8', 70000, 30),
('Катя', 'Катина', 'Инженер', '2', 70000, 25),
('Саша', 'Сасин', 'Инженер', '12', 50000, 35),
('Ольга', 'Васютина', 'Инженер', '2', 70000, 25),
('Петр', 'Некрасов', 'Уборщик', '36', 16000, 59),
('Саша', 'Петров', 'Инженер', '12', 50000, 49),
('Иван', 'Сидоров', 'Рабочий', '40', 50000, 59),
('Петр', 'Петров', 'Рабочий', '20', 25000, 40),
('Сидр', 'Сидоров', 'Рабочий', '10', 20000, 35),
('Антон', 'Антонов', 'Рабочий', '8', 19000, 28),
('Юрий', 'Юрков', 'Рабочий', '5', 15000, 25),
('Максим', 'Максимов', 'Рабочий', '2', 11000, 22),
('Юрий', 'Галкин', 'Рабочий', '3', 12000, 24),
('Людмила', 'Маркина', 'Уборщик', '10', 10000, 49),
('Юрий', 'Онегин', 'Начальник', '8', 100000, 39);

-- Ранжирование DENSE_RANK, RANK, ROW_NUMBER, NTILE 
-- Выведем всех сотрудников по рейтингу по зарплате 
SELECT post, salary,
CONCAT(firstname,' ', lastname) AS `fullname`,
DENSE_RANK() OVER(ORDER BY salary DESC) AS `dense_rank`,
RANK() OVER(ORDER BY salary DESC) AS `rank`,
ROW_NUMBER() OVER(ORDER BY salary DESC) AS `number`,
NTILE(6) OVER(ORDER BY salary DESC) AS `group`
FROM staff;

-- Выведем всех сотрудников по рейтингу по зарплате, но по каждой должности 
SELECT post, salary,
CONCAT(firstname,' ', lastname) AS `fullname`,
DENSE_RANK() OVER(PARTITION BY post ORDER BY salary DESC) AS `dense_rank`
FROM staff;


-- Выведем самых высокооплачиваемых сотрудников по каждой должности 
SELECT post, salary, `fullname`, `dense_rank`
FROM
(SELECT post, salary,
CONCAT(firstname,' ', lastname) AS `fullname`,
DENSE_RANK() OVER(PARTITION BY post ORDER BY salary DESC) AS `dense_rank`
FROM staff) AS rank_list
WHERE `dense_rank` = 1
ORDER BY salary DESC;

-- Агрегация 
/*
Выведем всех сотрудников, сгруппировав их по должности и рассчитав:
1. Сумму зарплат по должности
2. Процентное соотношение одной зарплаты к сумме по должности 
3. Средняя зарплата по должности 
4. Процентное соотношение одной зарплаты к средней по должности
*/

SELECT post, salary,
CONCAT(firstname,' ', lastname) AS `fullname`,
SUM(salary) OVER w AS `sum`,
ROUND(salary*100/SUM(salary) OVER w) AS `percent_sum`,
AVG(salary) OVER w `avg`,
ROUND(salary*100/AVG(salary) OVER w,2) AS `percent_avg`
FROM staff
WINDOW w AS (PARTITION BY post);

# Задания 

DROP TABLE IF EXISTS academic_record;
CREATE TABLE IF NOT EXISTS academic_record (	student_name varchar(45),
	quartal  varchar(45),
    course varchar(45),
	grade int
);

INSERT INTO academic_record
VALUES	('Александр','1 четверть', 'математика', 4),
	('Александр','2 четверть', 'русский', 4),
	('Александр', '3 четверть','физика', 5),
	('Александр', '4 четверть','история', 4),
	('Антон', '1 четверть','математика', 4),
	('Антон', '2 четверть','русский', 3),
	('Антон', '3 четверть','физика', 5),
	('Антон', '4 четверть','история', 3),
    ('Петя', '1 четверть', 'физика', 4),
	('Петя', '2 четверть', 'физика', 3),
	('Петя', '3 четверть', 'физика', 4),
	('Петя', '4 четверть', 'физика', 5);

SELECT * 
FROM academic_record;

-- Получить с помощью оконных функции:
-- 1. Средний балл ученика
-- 2. Наименьшую оценку ученика
-- 3. Наибольшую оценку ученика
-- 4. Выведите всех учеников без повторений

SELECT DISTINCT student_name, 
AVG(grade) OVER w AS `Средний бал`,
MIN(grade) OVER w AS `минимальный бал`,
MAX(grade) OVER w AS `максимальный бал`
FROM academic_record
WINDOW w AS (PARTITION BY student_name);


-- 1. Средний балл ученика:
SELECT student_name, AVG(grade) OVER (PARTITION BY student_name) AS average_grade
FROM academic_record;


-- 2. Наименьшую оценку ученика:
SELECT student_name, MIN(grade) OVER (PARTITION BY student_name) AS min_grade
FROM academic_record;


-- 3. Наибольшую оценку ученика:
SELECT student_name, MAX(grade) OVER (PARTITION BY student_name) AS max_grade
FROM academic_record;


-- 4. Выведите всех учеников без повторений:
SELECT DISTINCT student_name
FROM academic_record;

-- Смещение 

SELECT post, 
CONCAT(firstname,' ', lastname) AS `fullname`,
salary,
LAG(salary) OVER w `lag`,
LEAD(salary) OVER w `lead`,
FIRST_VALUE(lastname) OVER w `first`,
LAST_VALUE(lastname) OVER w `last`
FROM staff
WINDOW w AS (PARTITION BY post);

CREATE OR REPLACE VIEW v1 AS
SELECT post, 
CONCAT(firstname,' ', lastname) AS `fullname`,
salary,
LAG(salary) OVER w `lag`,
LEAD(salary) OVER w `lead`,
FIRST_VALUE(lastname) OVER w `first`,
LAST_VALUE(lastname) OVER w `last`
FROM staff
WINDOW w AS (PARTITION BY post);


ALTER VIEW v1 AS
SELECT post, 
CONCAT(firstname,' ', lastname) AS `fullname`,
salary, age, seniority,
age - salary,
LAG(salary) OVER w `lag`,
LEAD(salary) OVER w `lead`,
FIRST_VALUE(lastname) OVER w `first`,
LAST_VALUE(lastname) OVER w `last`
FROM staff
WHERE post = 'Инженер'
WINDOW w AS (PARTITION BY post);

SELECT * FROM v1;


DROP TABLE IF EXISTS summer_medals;
CREATE TABLE IF NOT EXISTS summer_medals 
(
	year INT,
    city VARCHAR(45),
    sport VARCHAR(45),
    discipline VARCHAR(45),
    athlete VARCHAR(45),
    country VARCHAR(45),
    gender VARCHAR(45),
    event VARCHAR(45),
    medal VARCHAR(45)
);

SELECT *
FROM summer_medals;
INSERT summer_medals
VALUES
	(1896, "Athens", "Aquatics", "Swimming", "HAJOS ALfred", "HUN", "Men","100M Freestyle", "Gold"),
	(1896, "Athens", "Archery", "Swimming", "HERSCHMANN Otto", "AUT", "Men","100M Freestyle", "Silver"),
    (1896, "Athens", "Athletics", "Swimming", "DRIVAC Dimitros", "GRE", "Men","100M Freestyle For Saliors", "Bronze"),
    (1900, "Athens", "Badminton", "Swimming", "MALOKINIS Ioannis", "GRE", "Men","100M Freestyle For Saliors", "Gold"),
    (1896, "Athens", "Aquatics", "Swimming", "CHASAPIS Spiridon", "GRE", "Men","100M Freestyle For Saliors", "Silver"),
    (1896, "Athens", "Aquatics", "Swimming", "CHOROPHAS Elfstathios", "GRE", "Men","1200M Freestele", "Bronze"),
    (1905, "Athens", "Aquatics", "Swimming", "HAJOS ALfred", "HUN", "Men","100M Freestyle For Saliors", "Gold"),
    (1896, "Athens", "Aquatics", "Swimming", "ANDREOU Joannis", "GRE", "Men","1200M Freestyle", "Silver"),
    (1896, "Athens", "Aquatics", "Swimming", "CHOROPHAS Elfstathios", "GRE", "Men","400M Freestyle", "Bronze");

/*
1.	Выберите имеющиеся виды спорта и пронумеруем их в алфавитном порядке
2.	Создайте представление, в которое попадает информация о спортсменах (страна, пол, имя)
3.Создайте представление, в котором будет храниться информация о спортсменах по конкретному виду спорта (Aquatics)
*/

-- 1.
SELECT sport, 
ROW_NUMBER() OVER(ORDER BY `sport`) `row_number`
FROM (SELECT DISTINCT sport FROM summer_medals) AS `distinct_sport`;

SELECT DISTINCT sport FROM summer_medals;

SELECT DISTINCT sport, 
ROW_NUMBER() OVER(ORDER BY `sport`) `row_number`
FROM summer_medals;

-- 2.
CREATE VIEW summer_medals_v AS 
SELECT country, gender, athlete FROM summer_medals;

SELECT * FROM summer_medals_v;

-- 3.
 ALTER VIEW summer_medals_v AS 
SELECT * FROM summer_medals
WHERE sport = 'Aquatics';