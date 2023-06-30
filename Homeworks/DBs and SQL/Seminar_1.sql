SELECT * FROM lesson1.Mobile_phones;

SELECT ProductName, Manufacturer, Price FROM Mobile_phones
WHERE ProductCount > 2;

SELECT * FROM Mobile_phones
WHERE Manufacturer = "Samsung";

SELECT * FROM Mobile_phones
WHERE ProductName LIKE "%Iphone%";

SELECT * FROM Mobile_phones
WHERE ProductName LIKE "%8%"; 