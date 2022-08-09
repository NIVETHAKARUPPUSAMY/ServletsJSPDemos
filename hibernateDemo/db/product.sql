USE mydb;

create table `product` (
	`id` bigint(20) not null auto_increment,
	`pname` varchar(255) null default null,
	
	primary key (`pid`)
);
select * from product;