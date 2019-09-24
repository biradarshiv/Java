create database jlconlinebookdb;

use jlconlinebookdb;

create table user_table
(userId varchar(10) primary key,
firstName varchar(20),
middleName varchar(20),
lastName varchar(20),
email varchar(50),
phone long);

create table login_table
(loginId varchar(10) primary key,
userId varchar(10),
username varchar(15),
password varchar(15),
role varchar(5),
foreign key (userId) references user_table(userId)
);

insert into user_table
values('JLC-U-0001','Sri','Nivas','Dande','srinivas@jlc.com',1234567890);

insert into login_table
values('JLC-L-0001','JLC-U-0001','srinivas','srinivas','Admin');

create table book_table
(bookId int primary key auto_increment,
bookName varchar(60),
author varchar(50),
cost float,
publication varchar(50),
edition varchar(15)
);

create table order_table
(orderId varchar(50) primary key,
address varchar(26),
street varchar(31),
city varchar(31),
state varchar(31),
country varchar(21),
zip varchar(6),
cardNo varchar(16),
expDate varchar(8),
totalAmount float,
totalItem int,
userId varchar(10),
orderDate varchar(10),
status varchar(25),
foreign key (userId) references user_table(userId)
);

create table orderItem_table
(orderItemId int primary key auto_increment,
bookId int,
quantity int,
orderId varchar(50),
foreign key (bookId) references book_table(bookId),
foreign key (orderId) references order_table(orderId)
);

