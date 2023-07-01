-- 1 задание --

DROP DATABASE IF EXISTS lesson2;
CREATE DATABASE IF NOT EXISTS lesson2;

USE lesson2;

DROP TABLE IF EXISTS sales;
CREATE TABLE IF NOT EXISTS sales
(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
order_date DATE NOT NULL,
count_product INT NOT NULL);

INSERT INTO sales (order_date, count_product)
VALUES
("2022-01-01", 156),
("2022-01-02", 180),
("2022-01-03", 21),
("2022-01-04", 124),
("2022-01-05", 341);


-- 2 задание --

SELECT id "id заказа",
	CASE
		WHEN count_product < 100 THEN "Маленький заказ"
		WHEN count_product >= 100 AND count_product < 300 THEN "Средний заказ"
		WHEN count_product >= 300 THEN "Большой заказ"
	END "Тип заказа"
FROM sales;


-- 3 задание -- 

DROP TABLE IF EXISTS orders;
CREATE TABLE IF NOT EXISTS orders
(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
employee_id VARCHAR(3) NOT NULL,
amount FLOAT NOT NULL,
order_status VARCHAR(10) NOT NULL);

INSERT INTO orders (employee_id, amount, order_status)
VALUES
("e03", 15.00, "OPEN"),
("e01", 25.50, "OPEN"),
("e05", 100.70, "CLOSED"),
("e02", 22.18, "OPEN"),
("e04", 9.50, "CANCELLED");

SELECT id, employee_id, amount, order_status,
	IF(order_status = "OPEN", "Order is in open state",
		IF(order_status = "CLOSED", "Order is closed", "Order is cancelled"))
full_order_status
FROM orders;


-- 4 задание --
/* В моем понимании 0 - это численный тип данных равный нулю,
NULL - отсутствие значения в определенной переменной с любым типом данных.
*/
