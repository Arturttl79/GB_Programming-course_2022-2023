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

SELECT * FROM `shop_db`.`product`
WHERE `shop_db`.`product`.`category`  = 'category_1';

DROP TABLE IF EXISTS `review`;
CREATE TABLE IF NOT EXISTS `review` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(45) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `rating` decimal (3,2) DEFAULT NULL,
  `product_id` BIGINT(20) DEFAULT NULL,
  `review_text` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB auto_increment=1 default charset=utf8mb3;

INSERT INTO `review` VALUES 
  (1, 'user_1@ksergei.tech', NOW(), 5, 1, 'Тестовый отзыв 1'),
  (2, 'user_2@ksergei.tech', NOW(), 5, 1, 'Тестовый отзыв 2'),
  (3, 'user_3@ksergei.tech', NOW(), 4, 2, 'Тестовый отзыв 3'),
  (4, 'user_1@ksergei.tech', NOW(), 4, 2, 'Тестовый отзыв 4'),
  (5, 'user_2@ksergei.tech', NOW(), 3, 3, 'Тестовый отзыв 5');
 
SELECT * FROM `shop_db`.`review`;

SELECT * FROM `shop_db`.`review`
WHERE `shop_db`.`review`.`product_id` = 1;


DROP TABLE IF EXISTS `product_order`;
CREATE TABLE IF NOT EXISTS `product_order` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(45) DEFAULT NULL,
  `order_date` varchar(45) DEFAULT NULL,
  `return_date` varchar(45) DEFAULT NULL,
  `product_id` BIGINT(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB auto_increment=1 default charset=utf8mb3;

SELECT * FROM `shop_db`.`product_order`;

SELECT * FROM `shop_db`.`product_order`
WHERE `shop_db`.`product_order`.user_email='user_1@ksergei.tech'
       AND `shop_db`.`product_order`.product_id = 1;
       