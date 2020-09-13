create database my_progress_tracker;

use my_progress_tracker;

create table per_day_progress (
    id int primary key auto_increment,
    `date` datetime not null,
    `duration_ms` bigint not null
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

LOCK TABLES `per_day_progress` WRITE;

insert into per_day_progress
values (1, '2020-08-22', 99*60*1000),
(2, '2020-08-23', 107*60*1000),
(3, '2020-08-24', 79*60*1000),
(4, '2020-08-25', 57*60*1000),
(5, '2020-08-26', 38*60*1000);

UNLOCK TABLES;