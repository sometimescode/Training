-- use activitydb;

-- create table city (
-- 	id int not null primary key auto_increment,
--     city_name varchar(100) not null
-- );

-- create table salesman (
-- 	id int not null primary key auto_increment,
--     salesman_name varchar(100) not null,
--     city_id int not null,
--     commission float not null,
--     foreign key(city_id) references city(id)
-- );

-- create table customer (
-- 	id int not null primary key auto_increment,
--     customer_name varchar(100) not null,
--     city_id int,
--     rating float default 0,
--     salesman_id int,
-- 	foreign key(city_id) references city(id),
--     foreign key(salesman_id) references salesman(id)
-- );

-- insert into city (city_name)
-- values
-- ('Manila'), ('Davao'), ('Caloocan'), ('Cebu'), ('Antipolo');

-- insert into salesman (salesman_name, city_id, commission)
-- values
-- ('John', 1, 100),
-- ('Jane', 2, 200),
-- ('Jim', 1, 300);

-- insert into customer (customer_name, city_id, salesman_id)
-- values
-- ('Mike', 1, 1),
-- ('Mary', 2, 2),
-- ('May', 2, 3);

-- insert into customer (customer_name, city_id) 
-- values
-- ('Bill', 2),
-- ('Bob', 2);

#1 in activity
select customer_name as Customer, salesman_name as Salesman 
from customer
left join salesman
on customer.salesman_id = salesman.id;

#2 in activity
select salesman_name as Salesman, city_name as City
from salesman
join city
on salesman.city_id = city.id;

#3 in activity
select salesman.salesman_name as Salesman, salesman.city_id as "Salesman's City ID", customer.customer_name as Customer, customer.city_id as "Customer's City ID", city.city_name as City
from salesman
join customer
join city
on salesman.id = customer.id and salesman.city_id = customer.city_id and customer.city_id = city.id;


#tried multiple ways for #3 in activity;
#using join
select *
from salesman
join customer
on salesman.id = customer.id
where salesman.city_id = customer.city_id;

select *
from salesman
join customer
on salesman.id = customer.id and salesman.city_id = customer.city_id;

#using cross join
select * 
from salesman
cross join customer
on salesman.id = customer.id and salesman.city_id = customer.city_id;

select * 
from salesman
cross join customer
on salesman.id = customer.id
where salesman.city_id = customer.city_id;