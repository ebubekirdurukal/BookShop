CREATE DATABASE IF NOT EXISTS bookShop;

CREATE TABLE IF NOT EXISTS `category` (
`category_id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `book_store` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
`city` varchar(255) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `book` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
`category_id` int(11) REFERENCES category(category_id),
`price` DOUBLE PRECISION,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `catalog_registration` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`book_store` int(11) REFERENCES book_store(id),
`book` int(11) REFERENCES book(id),
`relative_price` DOUBLE PRECISION,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO category VALUES(1,'roman');
INSERT INTO book_store VALUES(1,'D&R','Istanbul');
INSERT INTO book VALUES(5,'Tutunamayanlar',1,20);
INSERT INTO catalog_registration VALUES(1,1,1,5);