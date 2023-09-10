CREATE DATABASE IF NOT EXISTS `shop_db`;
USE `shop_db`;

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `creator` varchar(45) DEFAULT NULL,
  `description` text DEFAULT NULL,
  `copies` int(11) DEFAULT NULL,
  `copies_available` int(11) DEFAULT NULL,
  `category` varchar(11) DEFAULT NULL,
  `img` MEDIUMBLOB  DEFAULT NULL,
  PRIMARY KEY (`id`)
) engine=InnoDB auto_increment=1 default charset=utf8mb3;

INSERT INTO `product` VALUES 
  (1,'Продукт 1','Создатель 1','Описание 1', 5, 5, 'category_1',''),
  (2,'Продукт 2','Создатель 2','Описание 2', 4, 5, 'category_2',''),
  (3,'Продукт 3','Создатель 3','Описание 3', 3, 4, 'category_3',''),
  (4,'Продукт 4','Создатель 4','Описание 4', 2, 3, 'category_4',''),

  (5,'Продукт 5','Создатель 5','Описание 5', 2, 3, 'category_4',''),
  (6,'Продукт 6','Создатель 6','Описание 6', 2, 3, 'category_4',''),
  (7,'Продукт 7','Создатель 7','Описание 7', 2, 3, 'category_4',''),
  (8,'Продукт 8','Создатель 8','Описание 8', 2, 3, 'category_4',''),
  
  (9,'Продукт 9','Создатель 9','Описание 9', 2, 3, 'category_4',''),
  (10,'Продукт 10','Создатель 10','Описание 10', 2, 3, 'category_4',''),
  (11,'Продукт 11','Создатель 11','Описание 11', 2, 3, 'category_4',''),
  (12,'Продукт 12','Создатель 12','Описание 12', 2, 3, 'category_4','');

SELECT * FROM `shop_db`.`product`;