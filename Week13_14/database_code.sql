create database Miramar;

create table Student (
  ssn char(9), 
  firstName varchar(255), 
  mi char(100), 
  lastName varchar(255), 
  birthDate date,  
  street varchar(255),  
  phone char(10),  
  zipCode char(5),
  deptId char(4),  
  primary key (ssn)
); 

describe Student;

-- Date Format > YYYY-MM-DD

insert into Student (ssn, firstname, mi, lastname, birthDate, street, phone, zipCode, deptId)
values ('11113', 'Aadarsh', 'AD', 'Devi', '2095-12-25', 'MyStreet Address', 8582279775, 92128, 1357);
 
select * from Student;

select * from Student where birthDate = '2005-08-05';

drop table Student;