DROP DATABASE IF EXISTS lesson6;
CREATE DATABASE IF NOT EXISTS lesson6;
USE lesson6;

-- 1. Создайте функцию, которая принимает кол-во сек и формат их в кол-во дней часов. Пример: 123456 ->'1 days 10 hours 17 minutes 36 seconds' --
DROP FUNCTION IF EXISTS seconds_to_date;
DELIMITER $$
CREATE FUNCTION seconds_to_date(n INT) -- input - seconds
RETURNS VARCHAR(50)
DETERMINISTIC
BEGIN
    DECLARE days INT DEFAULT 0; -- days calculated
    DECLARE hrs INT DEFAULT 0; -- hours calculated
    DECLARE mins INT DEFAULT 0; -- minutes calculated
    DECLARE result VARCHAR(50) DEFAULT '00 days 00 hours 00 minutes 00 seconds'; -- result of the function calculation
    
	WHILE n > 0 DO
		IF n < 60 THEN
			SET result = CONCAT(days, ' days, ', hrs, ' hours, ', mins, ' minutes, ', n, ' seconds');
            SET n = 0;
		ELSEIF n < 3600 THEN
			SET mins = n DIV 60;
            SET n = n % 60;
            IF n = 0 THEN
				SET result = CONCAT(days, ' days, ', hrs, ' hours, ', mins, ' minutes, ', n, ' seconds');
			END IF;
		ELSEIF n < 86400 THEN
			SET hrs = n DIV 3600;
            SET n = n % 3600;
            IF n = 0 THEN
				SET result = CONCAT(days, ' days, ', hrs, ' hours, ', mins, ' minutes, ', n, ' seconds');
			END IF;
		ELSE 
			SET days = n DIV 86400;
            SET n = n % 86400;
            IF n = 0 THEN
				SET result = CONCAT(days, ' days, ', hrs, ' hours, ', mins, ' minutes, ', n, ' seconds');
			END IF;
		END IF;
	END WHILE;
	RETURN result;
END $$
DELIMITER ;
    
SELECT seconds_to_date(333);

-- 2. Создайте процедуру, которая выводит только четные числа от 1 до 10. Пример: 2,4,6,8,10
DROP PROCEDURE IF EXISTS even_nums;
DELIMITER //
CREATE PROCEDURE even_nums(n INT)
BEGIN
	DECLARE result VARCHAR(50) DEFAULT '0';
	IF n > 10 THEN
		SET result = 'Given number is bigger than 10';
    ELSEIF n DIV 2 = 5 THEN
		SET result = '2,4,6,8,10';
	ELSEIF n DIV 2 = 4 THEN
		SET result = '2,4,6,8';
	ELSEIF n DIV 2 = 3 THEN
		SET result = '2,4,6';
	ELSEIF n DIV 2 = 2 THEN
		SET result = '2,4';
	ELSEIF n DIV 2 = 1 THEN
		SET result = '2';
	END IF;
    SELECT result;
END //
DELIMITER ;

CALL even_nums(2);