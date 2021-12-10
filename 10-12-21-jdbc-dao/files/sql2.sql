select * from person;
select * from book;

create table user(
id int primary key auto_increment,
`name` varchar(25),
balance float
);

insert into `user` values(0, 'aaa', 1000);
insert into `user` values(0, 'bbb', 1000);

select * from user;

update `user` set balance = balance + 10 where id = 41;

