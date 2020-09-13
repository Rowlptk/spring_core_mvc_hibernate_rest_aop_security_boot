CREATE DATABASE  IF NOT EXISTS `hb_student_tracker`;
USE `hb_student_tracker`;

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

select * from student;

-- set auto_increment value
alter table hb_student_tracker.student auto_increment=3000;

-- truncate table and reset the auto_increment value
truncate hb_student_tracker.student;

-- add date_0f_birth column after last_name in student table
ALTER TABLE `hb_student_tracker`.`student` 
ADD COLUMN `date_of_birth` DATETIME NULL AFTER `last_name`;