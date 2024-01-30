create database simple_school;

use simple_school;

create table student(
    id int primary key auto_increment,
    sid varchar(20),
    name varchar(50),
    gender varchar(10),
    classroom varchar(10) comment '1:advanced 2:regular',
    create_date DATE,
    update_date DATE,
    status int comment '1表示停用、退訓'
);

insert into student(sid,name,gender,classroom,create_date,update_date) values ('20241001','羅納多','男','1',now(),now());
insert into student(sid,name,gender,classroom,create_date,update_date) values ('20241002','李花花','女','1',now(),now());
insert into student(sid,name,gender,classroom,create_date,update_date) values ('20241003','張傑','男','1',now(),now());
insert into student(sid,name,gender,classroom,create_date,update_date) values ('20241004','陳強','男','2',now(),now());
insert into student(sid,name,gender,classroom,create_date,update_date) values ('20241005','許仁','男','1',now(),now());
insert into student(sid,name,gender,classroom,create_date,update_date) values ('20241006','黃庭娟','女','1',now(),now());


ALTER TABLE student
    ADD COLUMN status int;