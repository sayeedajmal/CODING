CREATE TABLE employee
(fname varchar (15) not null,
minit char,
lname varchar (15) not null,
ssn char(4) not null,
bdate date,
address varchar (15),
se char,
salary int,
super_ssn char(4),
primary key(ssn),
FOREIGN KEY(super_ssn)REFERENCES employee(ssn));
