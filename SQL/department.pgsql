CREATE table department
(dname varchar (15) not null,
dnumber int not null,
mgr_ssn char(4) not null,
Mgr_Start_Date date,
primary key(dnumber),
UNIQUE(dname),
FOREIGN KEY (mgr_ssn)); 