DROP DATABASE IF EXISTS lesson4;
CREATE DATABASE IF NOT EXISTS lesson4;
USE lesson4;

DROP TABLE IF EXISTS teacher;
CREATE TABLE IF NOT EXISTS teacher
(	
	id INT NOT NULL PRIMARY KEY,
    surname VARCHAR(45),
    salary INT
);

INSERT teacher
VALUES
	(1,"Авдеев", 17000),
    (2,"Гущенко",27000),
    (3,"Пчелкин",32000),
    (4,"Питошин",15000),
    (5,"Вебов",45000),
    (6,"Шарпов",30000),
    (7,"Шарпов",40000),
    (8,"Питошин",30000);
    
SELECT * from teacher; 

DROP TABLE IF EXISTS lesson;
CREATE TABLE IF NOT EXISTS lesson
(	
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    course VARCHAR(45),
    teacher_id INT,
    FOREIGN KEY (teacher_id)  REFERENCES teacher(id)
);
INSERT INTO lesson(course,teacher_id)
VALUES
	("Знакомство с веб-технологиями",1),
    ("Знакомство с веб-технологиями",2),
    ("Знакомство с языками программирования",3),
    ("Базы данных и SQL",4);


-- Получим имена преподавателей которые ведут курсы 

SELECT teacher.surname, lesson.course
FROM teacher
JOIN lesson -- INNER JOIN = JOIN 
ON teacher.id = lesson.teacher_id;

SELECT * 
FROM teacher, lesson 
WHERE teacher.id = lesson.teacher_id;

SELECT * FROM teacher
WHERE EXISTS (SELECT * FROM lesson 
WHERE teacher.id = lesson.teacher_id);

-- Получим всех преподавателей

SELECT t.surname, l.course
FROM teacher AS t 
LEFT JOIN lesson l
ON t.id=l.teacher_id; 


SELECT t.surname, l.course
FROM lesson l
RIGHT JOIN teacher t
ON t.id=l.teacher_id; 

-- Получим фамилии учителей, которые ничего не ведут 


SELECT t.surname, l.course
FROM teacher AS t 
LEFT JOIN lesson l
ON t.id=l.teacher_id
WHERE l.course IS NULL;

SELECT id, surname FROM teacher
WHERE surname = "Питошин";


SELECT l.*, web_teacher.*
FROM lesson l
JOIN (SELECT id, surname FROM teacher
WHERE surname = "Питошин") AS web_teacher
ON web_teacher.id=l.teacher_id;

SELECT * FROM teacher
WHERE id IN(1,3);

SELECT * FROM teacher
WHERE EXISTS (SELECT * FROM lesson 
WHERE teacher.id = lesson.teacher_id);

SELECT * FROM teacher
WHERE NOT EXISTS (SELECT * FROM lesson 
WHERE teacher.id = lesson.teacher_id);




SELECT * FROM teacher
WHERE EXISTS(SELECT * FROM lesson
WHERE teacher.id = lesson.teacher_id AND course = "Знакомство с веб-технологиями");

SELECT t.*, l.course
FROM lesson l
JOIN teacher t
ON t.id=l.teacher_id
WHERE course = "Знакомство с веб-технологиями";

SELECT t.* 
FROM teacher t, lesson l
WHERE t.id = l.teacher_id AND
	l.course = "Знакомство с веб-технологиями";
    
SELECT t.*, web_lesson.*
FROM teacher t
JOIN
(SELECT course, teacher_id
FROM lesson WHERE course = "Знакомство с веб-технологиями") AS web_lesson
ON t.id = web_lesson.teacher_id;




SELECT t.*, l.*,
(SELECT COUNT(*)
FROM teacher t
CROSS JOIN lesson l) AS t2
FROM teacher t
CROSS JOIN lesson l;

SELECT * FROM teacher
UNION
SELECT * FROM lesson;


SELECT id FROM teacher
UNION ALL
SELECT id FROM lesson;


DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users
(
    id  int auto_increment primary key,
    login varchar(255) null,
    pass  varchar(255) null,
    male  tinyint      null
);

DROP TABLE IF EXISTS clients;
CREATE TABLE IF NOT EXISTS clients
(
    id    int auto_increment primary key,
    login varchar(255) null,
    pass  varchar(255) null,
    male  tinyint      null
);

INSERT INTO users (login, pass, male) 
VALUES 
('alex', '$2y$10$6SzbBCMENklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH14y', 1),
('Mikle', '$ws$10$6SzbBCMENklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH14y', 1),
 ('Olia', '$2y$10$88zbBCKLJklStIgTqBKIluijJUnbeZ5WqJI4RJgkksnFZon5kH14y', 2),
 ('Tom', '$2y$20$6SzbBCNRNklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH20y', 1),
('Margaret', '$2y$20$6SzbBCNRNklStIgTqBKIluijJUnbeZ4wqIu4RJgkksnFZon5kH20y', 2);

INSERT INTO clients (login, pass, male) VALUES ('alexander', '$2y$10$6SzbBCMENklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH14y', 1),
 ('Mikle', '$ws$10$6SzbBCMENklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH14y', 1),
('Olia', '$2y$10$88zbBCKLJklStIgTqBKIluijJUnbeZ5WqJI4RJgkksnFZon5kH14y', 2),
('Dmitry', '$2y$20$6SzbBCNRNklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH20y', 1),
 ('Margaret', '$2y$20$6SzbBCNRNklStIgTqBKIluijJUnbeZ4wqIu4RJgkksnFZon5kH20y', 2),
('Leonid', '$2y$10$6SzbBCMENklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH14y', 1),
 ('Olga', '$2y$10$88zbBCKLJklStIgTqBKIluijJUnbeZ5WqJI4RJgkksnFZon5kH14y', 2),
 ('Tom', '$2y$20$6SzbBCNRNklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH20y', 1),
('Masha', '$2y$20$6SzbBCNRNklStIgTqBKIluijJUnbeZ4wqIu4RJgkksnFZon5kH20y', 2),
 ('alex', '$2y$10$6SzbBCMENklStIgTqBKIluijJUnbeZ5WqIu4RJgkksnFZon5kH14y', 1);


-- 1 --
SELECT * FROM users
UNION
SELECT * FROM clients;

-- 2 --
SELECT login FROM users
UNION ALL
SELECT login FROM clients;

-- 3 --
SELECT login FROM users
UNION
SELECT login FROM clients;

SELECT u.login, c.login
FROM users u 
JOIN clients c 
ON u.login = c.login;
-- 4 --
SELECT * FROM users u
WHERE male = 1
UNION ALL
SELECT * FROM clients c
WHERE male = 1;

SELECT u.login, c.login
FROM users u 
JOIN clients c 
ON u.login = c.login
WHERE c.male = 1;

-- 5 --
SELECT * FROM users
CROSS JOIN clients;

-- 6 --
SELECT * FROM users AS u
LEFT JOIN clients c
ON u.id = c.id
UNION
SELECT * FROM users u
RIGHT JOIN clients c
ON u.id = c.id;

SELECT * FROM users AS u
LEFT JOIN clients c
ON u.id = c.id
WHERE u.male = 1
UNION
SELECT * FROM users u
RIGHT JOIN clients c
ON u.id = c.id
WHERE c.male = 1;

SELECT * FROM teacher;

ALTER TABLE teacher
ADD email VARCHAR(40) AFTER surname;
