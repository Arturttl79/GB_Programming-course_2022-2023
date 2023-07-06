DROP DATABASE IF EXISTS lesson2;
CREATE DATABASE IF NOT EXISTS lesson2;

USE lesson2;

DROP TABLE IF EXISTS cinema;
CREATE TABLE IF NOT EXISTS movies
(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(45) NOT NULL,
title_eng VARCHAR(45) NOT NULL,
year_movie YEAR NOT NULL,
count_min INT,
storyline TEXT);

-- DDL (Определение данных) CREATE ALTER DROP RENAME TRUNCATE 
-- RENAME TABLE old_name TO new_name
RENAME TABLE movies TO cinema;

-- DML (Манипуляции с данными) SELECT INSERT UPDATE DELETE 
INSERT INTO cinema (title, title_eng, year_movie, count_min, storyline)
VALUES 
	('Игры разума', 'A Beautiful Mind', 2001, 135, 'От всемирной известности до греховных глубин — все это познал на своей шкуре Джон Форбс Нэш-младший. Математический гений, он на заре своей карьеры сделал титаническую работу в области теории игр, которая перевернула этот раздел математики и практически принесла ему международную известность. Однако буквально в то же время заносчивый и пользующийся успехом у женщин Нэш получает удар судьбы, который переворачивает уже его собственную жизнь.'),
	('Форрест Гамп', 'Forrest Gump', 1994, 142, 'Сидя на автобусной остановке, Форрест Гамп — не очень умный, но добрый и открытый парень — рассказывает случайным встречным историю своей необыкновенной жизни. С самого малолетства парень страдал от заболевания ног, соседские мальчишки дразнили его, но в один прекрасный день Форрест открыл в себе невероятные способности к бегу. Подруга детства Дженни всегда его поддерживала и защищала, но вскоре дороги их разошлись.'),
	('Иван Васильевич меняет профессию', "...", 1998, 128,'Инженер-изобретатель Тимофеев сконструировал машину времени, которая соединила его квартиру с далеким шестнадцатым веком - точнее, с палатами государя Ивана Грозного. Туда-то и попадают тезка царя пенсионер-общественник Иван Васильевич Бунша и квартирный вор Жорж Милославский. На их место в двадцатом веке «переселяется» великий государь. Поломка машины приводит ко множеству неожиданных и забавных событий...'),
	('Назад в будущее', 'Back to the Future', 1985, 116, 'Подросток Марти с помощью машины времени, сооружённой его другом-профессором доком Брауном, попадает из 80-х в далекие 50-е. Там он встречается со своими будущими родителями, ещё подростками, и другом-профессором, совсем молодым.'),
	('Криминальное чтиво', 'Pulp Fiction', 1994, 154, "...");

SELECT * FROM cinema;

-- DDL ALTER 
ALTER TABLE cinema
ADD COLUMN category INT,
ADD price INT DEFAULT 100;

ALTER TABLE CINEMA
MODIFY COLUMN title VARCHAR(55);

-- DML UPDATE 
UPDATE cinema 
SET category = RAND();
-- 0 - фильм, который можно оплатить онлайн 
-- 1 - фильм, который можно оплатить на кассе 

SELECT category AS "Категория", title "Название фильма",
	CASE 
		WHEN category = 1 THEN "Оплатите фильм на кассе"
        WHEN category = 0 THEN "Оплатите фильм онлайн"
        ELSE "Ошибка"
	END message
FROM cinema;

-- Функция IF
-- IF(условие, зн_истины, зн_лжи) 
SELECT IF(500<200, "Yes", "No") result;

/*
До 50 минут - короткометражка
от 50 до 100 минут - среднеметражка 
больше 100 - полнометражка 
*/

SELECT
id "Номер фильма",
title "Название фильма",
count_min "Продолжительность фильма",
IF(count_min < 50, "Короткометражка",
	IF(count_min >= 50 AND count_min < 100, "Среднеметражка",
		IF(count_min >= 100, "Полнометражка", "Неопределенно"))) AS "Тип Фильма"
FROM cinema;

UPDATE cinema
SET count_min = 49
WHERE title IN("Игры разума","Форрест Гамп");

UPDATE cinema
SET count_min = 70
WHERE title IN("Назад в будущее");

/*
DROP - удаляет объект из памяти компьютера 
DELETE - удаляет строку или несколько строк из таблицы 
TRUNCATE - очищает нашу таблицу, оставляя атрибуты
*/

DELETE FROM cinema 
WHERE title = 'Игры Разума';

TRUNCATE TABLE cinema;
SELECT * FROM cinema;