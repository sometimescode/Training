-- CREATE DATABASE sampledb;
-- USE sampledb;

-- CREATE TABLE students (
-- 	id INT,
--     name VARCHAR(100),
--     PRIMARY KEY (id)
-- );

-- CREATE TABLE courses (
-- 	course_id INT,
--     title VARCHAR(200),
--     PRIMARY KEY (course_id)
-- );

-- CREATE TABLE student_courses (
-- 	student_id INT NOT NULL,
--     course_id INT NOT NULL,
--     FOREIGN KEY (student_id) REFERENCES students(id),
--     FOREIGN KEY (course_id) REFERENCES courses(course_id)
-- );

-- INSERT INTO students VALUES (1, 'Sam');
-- INSERT INTO students VALUES (2, 'Mary');
-- INSERT INTO students VALUES (3, 'Tine');

-- SELECT * from students;

-- INSERT INTO courses VALUES (1, 'SQL Server');
-- INSERT INTO courses VALUES (2, 'ASP.NET MVC');
-- INSERT INTO courses VALUES (3, 'MongoDB');
-- INSERT INTO courses VALUES (4, 'Java');
-- INSERT INTO courses VALUES (5, 'PHP');

-- SELECT * FROM courses

-- INSERT INTO student_courses VALUES (1, 1);
-- INSERT INTO student_courses VALUES (1, 2);
-- INSERT INTO student_courses VALUES (1, 3);
-- INSERT INTO student_courses VALUES (2, 3);
-- INSERT INTO student_courses VALUES (2, 4);
-- INSERT INTO student_courses VALUES (3, 3);
-- INSERT INTO student_courses VALUES (3, 5);

-- SELECT * FROM student_courses;

-- SELECT * FROM students WHERE id = 1 AND name = 'Sam';
-- SELECT * FROM students WHERE id = 1 AND name = 'May';
-- SELECT * FROM students WHERE id = 1 OR name = 'Tine';
-- SELECT * FROM students WHERE NOT id = 1;

-- DELETE FROM students WHERE id = 3;

-- UPDATE students
-- SET name = 'Sam Doe'
-- WHERE id = 1;

-- ACTIVITY
-- CREATE DATABASE rsclassdb;
-- USE rsclassdb;

-- CREATE TABLE students (
-- 	id INT,
--     first_name VARCHAR(10),
--     last_name VARCHAR(10),
--     age INT,
--     PRIMARY KEY (id)
-- );

-- CREATE TABLE topics (
-- 	id INT,
--     title VARCHAR(50),
--     status ENUM('on-going', 'done'),
--     PRIMARY KEY (id)
-- );

-- CREATE TABLE activities (
-- 	id INT,
--     related_topic INT NOT NULL,
--     instruction TEXT(250),
--     due_date DATE,
--     PRIMARY KEY (id),
--     FOREIGN KEY (related_topic) REFERENCES topics(id)
-- );

-- CREATE TABLE student_activity (
-- 	id INT NOT NULL,
--     student_id INT NOT NULL,
--     activity_id INT NOT NULL,
--     score INT,
--     FOREIGN KEY (id) REFERENCES topics(id),
--     FOREIGN KEY (student_id) REFERENCES students(id),
--     FOREIGN KEY (activity_id) REFERENCES activities(id)
-- );

-- INSERT INTO students VALUES (1, 'John', 'Doe', 15);
-- INSERT INTO students VALUES (2, 'Mary', 'Smith', 15);
-- INSERT INTO students VALUES (3, 'John', 'Jones', 15);

-- INSERT INTO topics VALUES(1, 'Dodgeball', 'done');
-- INSERT INTO topics VALUES(2, 'Relay Race', 'done');
-- INSERT INTO topics VALUES(3, 'Ping Pong', 'on-going');

-- INSERT INTO activities VALUES(1, 1, 'Dodgeball Instruction', '2022-5-9');
-- INSERT INTO activities VALUES(2, 2, 'Relay Race Instruction', '2022-5-11');
-- INSERT INTO activities VALUES(3, 3, 'Ping Pong Instruction', '2022-5-11');

-- INSERT INTO student_activity VALUES(1, 1, 1, 90);
-- INSERT INTO student_activity VALUES(2, 1, 2, 90);
-- INSERT INTO student_activity VALUES(2, 2, 2, 95);