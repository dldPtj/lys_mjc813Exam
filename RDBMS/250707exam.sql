create table gugudan(
	id int unsigned not null auto_increment primary key
	, dan_name varchar(5) not null
	, num1 int unsigned not null
	, num2 int unsigned not null
);

drop table gugudan;

select num, id, (id*num) as result from gugudan;

select * from gugudan;