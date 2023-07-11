CREATE DATABASE lesson6;
USE lesson6;

DROP PROCEDURE hello;
DELIMITER //
CREATE PROCEDURE hello()
BEGIN
	CASE
		WHEN CURTIME() BETWEEN '06:00:00' AND '11:59:00' THEN
			SELECT 'Good morning!' AS 'time';
        WHEN CURTIME() BETWEEN '12:00:00' AND '17:59:00' THEN
			SELECT 'Good day!' AS 'time';
        WHEN CURTIME() BETWEEN '18:00:00' AND '23:59:00' THEN
			SELECT 'Good evening' AS 'time';
		ELSE 
			SELECT 'Good night!' AS 'time';
	END CASE;
END //
DELIMITER ;

CALL hello();

DELIMITER $$
CREATE FUNCTION fibonacci(n INT) -- qty of Fibonacci numbers for the output
RETURNS VARCHAR(50)
DETERMINISTIC
BEGIN
	DECLARE fib1 INT DEFAULT 0;
    DECLARE fib2 INT DEFAULT 1;
	DECLARE fib3 INT DEFAULT 0;
    DECLARE result VARCHAR(50) DEFAULT '0 1'; -- first 2 numbers of Fibonacci
    
    IF n = 1 THEN
		RETURN fib1;
    ELSEIF n = 2 THEN
		RETURN CONCAT(fib1, ' ', fib2); -- = result
    ELSE
		WHILE n > 2 DO
			SET fib3 = fib1 + fib2;
            SET fib1 = fib2;
            SET fib2 = fib3;
            SET n = n - 1;
            SET result = CONCAT(result, ' ', fib3);
		END WHILE;
        RETURN result;
	END IF;
    END $$
    DELIMITER ;
    
SELECT fibonacci(18);

/* 
Создайте и вызовите процедуру, которая при ее вызове будет выводить:
«Однозначное число» - если ее параметр равен от 1 до 9
«Двухзначное число» - если ее параметр равен от 10 до 99
«Трехзначное число» - если ее параметр равен от 100 до 999
Создайте функцию которая будет вычислять сумму трех переменных
a = 2030, b = 5124, c = 7903.
*/

-- 1 --
DELIMITER //
CREATE PROCEDURE numbers_count(n INT)
BEGIN
	CASE
		WHEN n BETWEEN 1 AND 9 THEN
			SELECT '1 digit number' AS 'result';
        WHEN n BETWEEN 10 AND 99 THEN
			SELECT '2 digits number' AS 'result';
		WHEN n BETWEEN 100 AND 999 THEN
			SELECT '3 digits number' AS 'result';
        ELSE 
			SELECT 'Please type number between 1 and 999' AS 'result';
	END CASE;
END //
DELIMITER ;

CALL numbers_count(192);

-- 2 --
DROP FUNCTION count_sum;

DELIMITER //
CREATE FUNCTION count_sum(a INT, b INT, c INT) -- numbers to count the sum
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE sum INT DEFAULT 0;
	SET sum = a + b + c;
    RETURN sum;
    END //
    DELIMITER ;
    
SELECT count_sum(2030, 5124, 7903);

CREATE TABLE bankaccounts(accountno varchar(20) PRIMARY KEY NOT NULL, funds decimal(8,2));

INSERT INTO bankaccounts VALUES("ACC1", 1000);
INSERT INTO bankaccounts VALUES("ACC2", 1000);

SELECT * FROM bankaccounts;

UPDATE bankaccounts
SET funds = funds - 100
WHERE accountno = 'ACC1';

START TRANSACTION;
UPDATE bankaccounts
SET funds = funds - 100
WHERE accountno = 'ACC1';
UPDATE bankaccounts
SET funds = funds + 100
WHERE accountno = 'ACC2';
COMMIT;

START TRANSACTION;
UPDATE bankaccounts
SET funds = funds - 100
WHERE accountno = 'ACC1';
UPDATE bankaccounts
SET funds = funds + 100
WHERE accountno = 'ACC2';
ROLLBACK;

START TRANSACTION;
UPDATE bankaccounts
SET funds = funds - 100
WHERE accountno = 'ACC1';
UPDATE bankaccounts
SET funds = funds + 100
WHERE accountno = 'ACC2';
TRUNCATE bankaccounts;