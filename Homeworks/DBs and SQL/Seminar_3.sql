DROP DATABASE IF EXISTS `lesson3`;
CREATE DATABASE IF NOT EXISTS `lesson3`;
USE lesson3;
CREATE TABLE IF NOT EXISTS staff
(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`firstname` VARCHAR(45),
`lastname` VARCHAR(45),
`post` VARCHAR(45),
`seniority` INT,
`salary` INT,
`age` INT);

INSERT INTO `staff` (`firstname`, `lastname`, `post`,`seniority`,`salary`, `age`)
VALUES
('Вася', 'Васькин', 'Начальник', 40, 100000, 60), 
('Петр', 'Власов', 'Начальник', 8, 70000, 30),
('Катя', 'Катина', 'Инженер', 2, 70000, 25),
('Саша', 'Сасин', 'Инженер', 12, 50000, 35),
('Иван', 'Петров', 'Рабочий', 40, 30000, 59),
('Петр', 'Петров', 'Рабочий', 20, 55000, 40),
('Сидр', 'Сидоров', 'Рабочий', 10, 20000, 35),
('Антон', 'Антонов', 'Рабочий', 8, 19000, 28),
('Юрий', 'Юрков', 'Рабочий', 5, 15000, 25),
('Максим', 'Петров', 'Рабочий', 2, 11000, 22),
('Юрий', 'Петров', 'Рабочий', 3, 12000, 24),
('Людмила', 'Маркина', 'Уборщик', 10, 10000, 49);

SELECT * FROM staff;

CREATE TABLE IF NOT EXISTS `activity_staff`
(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`staff_id` INT,
FOREIGN KEY (staff_id) REFERENCES staff(id),
`date_activity` DATE,
`count_pages` INT
);

INSERT activity_staff (`staff_id`, `date_activity`, `count_pages`)
VALUES
(1,'2022-01-01',250),
(2,'2022-01-01',220),
(3,'2022-01-01',170),
(1,'2022-01-02',100),
(2,'2022-01-01',220),
(3,'2022-01-01',300),
(7,'2022-01-01',350),
(1,'2022-01-03',168),
(2,'2022-01-03',62),
(3,'2022-01-03',84);


-- Домашнее задание! --

# Task 1
SELECT * FROM staff
ORDER BY salary DESC;

SELECT * FROM staff
ORDER BY salary;

# Task 2
SELECT salary FROM staff
ORDER BY salary DESC
LIMIT 5;

# Task 3
SELECT post, SUM(salary) FROM staff
GROUP BY post;

# Task 4
SELECT COUNT(post) 'young_workers_qty' FROM staff
WHERE post = 'Рабочий' AND age BETWEEN 24 AND 49;

# Task 5
SELECT post, COUNT(post) FROM staff
GROUP BY post;

# Task 6
SELECT post FROM staff
GROUP BY post
HAVING AVG(age) <= 30;

# Task 7
SELECT staff_id, SUM(count_pages) AS pages_qty FROM activity_staff
GROUP BY staff_id
HAVING pages_qty > 500;

# Task 8
SELECT date_activity, COUNT(DISTINCT staff_id) 'staff_qty' FROM activity_staff
GROUP BY date_activity
HAVING staff_qty > 3;

# Task 9
SELECT post, AVG(salary) 'salary_average' FROM staff
GROUP BY post
HAVING salary_average > 30000;