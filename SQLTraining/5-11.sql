-- USE sampledb;

-- create table persons
-- (id int not null primary key,
-- last_name varchar(255),
-- first_name varchar(255),
-- birthyear year);

-- alter table persons
-- drop birthyear,
-- add age int

-- alter table persons
-- modify id int auto_increment,
-- modify last_name varchar(255) not null,
-- modify first_name varchar(255) not null,
-- add check (age>25);

-- alter table persons
-- modify last_name varchar(255) not null default '-',
-- modify first_name varchar(255) not null default '-';

-- insert into persons(last_name, first_name, age) values('Marayan', 'Anna Marie', 22);
-- insert into persons(age) values(26);

-- CREATE DATABASE activitydb;
-- USE activitydb;

-- create table students (
-- 	id int not null primary key auto_increment,
--     last_name varchar(255) not null,
--     first_name varchar(255) not null,
--     status enum('enrolled', 'graduated', 'unknown') not null default 'unknown',
--     grade float not null,
--     check (grade >= 75)
-- );

-- INSERT INTO students(last_name, first_name, status, grade)
-- VALUES
-- ('Dela Cruz', 'Juan', 'enrolled', 98),
-- ('Clarkson', 'Kelly', 'graduated', 84),
-- ('Gomez', 'Bea', 'graduated', 95),
-- ('Bernardo', 'Kathryn', 'enrolled', 98),
-- ('Perez', 'Carl', 'enrolled', 89),
-- ('Reyes', 'Kristine', 'graduated', 84),
-- ('Howard', 'Edward', 'enrolled', 88);

-- INSERT INTO students(last_name, first_name, grade)
-- VALUES
-- ('Marayan', 'Anna Marie', 99.5),
-- ('Chiu', 'Kim', 83),
-- ('Chu', 'Daniel', 77),
-- ('Padilla', 'Daniel', 78);

-- Return list of students with grades in ascending order
select * from students order by(grade) asc;
-- Return list of enrolled students with grades that are equal or higher than the average grade
-- average grade is 88.5
select avg(grade) from students;
select * from students where status = 'enrolled' and grade >= (select avg(grade) from students); 
-- Return the top 3 graduated students
select * from students order by(grade) desc limit 3;
-- Return the list of students in alphabetical order (last name)
select * from students order by(last_name) asc;
-- Return the list of unknown students with grades that are lower than the average grade of enrolled students
-- average grade of enrolled students is 93.25
select avg(grade) from students where status = 'enrolled';
select * from students where status = 'unknown' AND grade < (select avg(grade) from students where status = 'enrolled');

select *, (select count(id) from students) as 'count' from students;