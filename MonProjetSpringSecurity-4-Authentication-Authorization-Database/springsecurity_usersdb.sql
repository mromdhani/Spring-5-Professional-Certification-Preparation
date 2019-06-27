

create database if not exists `springsecurity_usersdb`;

USE `springsecurity_usersdb`;


CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert into `role` (`id`,`role`) values (2,'USER');
insert into `role` (`id`,`role`) values (4,'ADMIN');

/*Table structure for table `user` */

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert into `user` (`id`,`enabled`,`password`,`username`) values (1,'1','$2a$10$mumVsNmk/qG7/XFv8RYaJeAi/ZZ3s3Op.TyXRndinquxsmXp92Tbi','user');
insert into `user` (`id`,`enabled`,`password`,`username`) values (3,'1','$2a$10$BF2LdcvxDYvqZ//FmO6N0uFOMkm25Gt6i55OeEqSR0b5X43Ixyori','admin');

/*Table structure for table `user_roles` */

CREATE TABLE `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKrhfovtciq1l558cw6udg0h0d3` (`role_id`),
  CONSTRAINT `FK55itppkw3i07do3h7qoclqd4k` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKrhfovtciq1l558cw6udg0h0d3` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_roles` */

insert into `user_roles` (`user_id`,`role_id`) values (1,2);
insert into `user_roles` (`user_id`,`role_id`) values (3,4);

