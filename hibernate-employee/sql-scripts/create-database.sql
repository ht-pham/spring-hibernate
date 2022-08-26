CREATE DATABASE IF NOT EXISTS `hb_employee_tracker`;
USE `hb_employee_tracker`;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
`id` int NOT NULL auto_increment,
`first_name` varchar(45) DEFAULT NULL,
`last_name` varchar(45) DEFAULT NULL,
`company` varchar(90) DEFAULT NULL,
primary key (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
