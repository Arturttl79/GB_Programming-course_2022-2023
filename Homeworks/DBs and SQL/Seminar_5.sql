CREATE TABLE cars
(
	id INT NOT NULL PRIMARY KEY,
    name VARCHAR(45),
    cost INT
);

INSERT cars
VALUES
	(1, "Audi", 52642),
    (2, "Mercedes", 57127 ),
    (3, "Skoda", 9000 ),
    (4, "Volvo", 29000),
	(5, "Bentley", 350000),
    (6, "Citroen ", 21000 ), 
    (7, "Hummer", 41400), 
    (8, "Volkswagen ", 21600);
    
SELECT *
FROM cars;

-- 1 --
CREATE VIEW cheap_cars AS
SELECT * FROM cars
WHERE cost < 25000;

SELECT * FROM cheap_cars;

-- 2 --
ALTER VIEW cheap_cars AS
SELECT * FROM cars
WHERE cost < 30000;

SELECT * FROM cheap_cars;

-- 3 --
CREATE VIEW skoda_audi AS
SELECT * FROM cars
WHERE name IN('Skoda', 'Audi');

SELECT * FROM skoda_audi;

-- 1* --
SELECT *,
DENSE_RANK() OVER(ORDER BY cost)
FROM cars;

-- 2* --
SELECT *
FROM cars
ORDER BY cost DESC
LIMIT 3;

-- 3* --
SELECT *
FROM (SELECT *, cost - LAG(cost) OVER() AS `cost_diff_with_prev` from cars) AS diff_list
WHERE `cost_diff_with_prev` > 0;

-- 4* --
SELECT *
FROM (SELECT *, cost - LEAD(cost) OVER() AS `cost_diff_with_next` from cars) AS diff_list
WHERE `cost_diff_with_next` < 0;

-- 5* --
SELECT *,
cost - LEAD(cost) OVER() AS `cost_diff_with_next`
FROM cars
ORDER BY cost;