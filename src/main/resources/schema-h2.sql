drop table if exists Employee;

CREATE TABLE Employee (
  empId varchar(32) DEFAULT '' primary key,
  empName varchar(15)  NOT NULL DEFAULT 'new one',
  Tid int DEFAULT NULL,
  userId varchar(20) NOT NULL DEFAULT 'new',
  password varchar(60)  NOT NULL DEFAULT 'passwd'
) ;

drop table if exists Titles;

CREATE TABLE Titles (
  t_id int NOT NULL primary key,
  code varchar(5) NOT NULL,
  name varchar(30)  NOT NULL,
  level int DEFAULT 0
);