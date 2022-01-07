create table `customers`(
`id` int,
`name` varchar(25),
primary key (`id`)
);

create table `orders`(
`id` int,
`customer_id` int,
`order_price` float,
primary key (`id`),
foreign key (`customer_id`) references customers(`id`)
);

select * from customers;
select * from orders;

insert into customers values (1, 'David');
insert into customers values (2, 'Sarrah');

insert into orders values(101, 1, 30);
insert into orders values(102, 2, 55);
insert into orders values(103, null, 19);

insert into orders values(104, 1, 30);
insert into orders values(105, 1, 30);
insert into orders values(106, 2, 99);

-- join
select o.id, o.order_price, c.name 
from orders o join customers c
on c.id = o.customer_id
where customer_id = 2
;

