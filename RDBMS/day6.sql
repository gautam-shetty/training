select user from dual;
desc dual;

select 2+2 from dual;  --dummy table
select null+null from dual;
select 2+'' from dual;

alter table college add primary key(clgid);
desc college;

create table studFrTests
 ( rolNo int primary key,
 clgCode int,
sname varchar(20),
constraint fk foreign key(clgCode) references college(clgid) );

--Triggers--
------------
create table dept (deptID int primary key, deptName varchar(20) check(deptName in('sales','marketing')));
  insert into dept values(1,'sales');
  insert into dept values(2,'marketing');

create table emp ( empID int primary key, empName varchar(20), Age int, deptID int,constraint fk1 foreign key(deptID) references dept(deptID));
create table empBackup ( empID int primary key, empName varchar(20), Age int, deptID int);

--below trigger creats a backup table for emp table
create or replace trigger empBackup after insert on emp for each row begin insert into empBackup (empID,empName,Age,deptID) values(:new.empID,:new.empName,:new.Age,:new.deptID); end; /

insert into emp values(08,'Person1',22,1);  --aoutomatically this values are inserted to empBackup
select * from emp;  select * from empBackup; -- to check the working

create table bin ( empID int primary key, empName varchar(20), Age int, deptID int);
insert into emp values(11,'Person2',33,2);

--below trigger creates a bin table to store deleted entries from table emp
create or replace trigger delTrig before delete on emp for each row begin insert into bin (empID,empName,Age,deptID) values(:old.empID,:old.empName,:old.Age,:old.deptID); end; /

delete from emp where empid='11';
select * from emp;  select * from empBackup; select * from bin; -- to check the working

create table empinfo ( empID int primary key, empName varchar(20), DOB date);

create or replace trigger datecheck before insert on empinfo for each row begin if :new.dob>sysdate then raise_application_error(-20010,'Date is Future Date'); end if; end; /

set serveroutput on;
insert into empinfo values(99,'gautam','25-may-1997');
insert into empinfo values(22,'sahil','29-feb-2022');  --wont be allowed
select * from empinfo;

create table school( day char(3), sess int, fac varchar(20), room int, sem int, sub varchar(20),
                      unique(day, sess, room), unique(day, sess, fac), unique(day, sess, sem)
                    );
insert into school values ('mon',1,'A',1,1,'eng');
insert into school values ('mon',1,'A',2,1,'math');  --unique constraint (DXC.SYS_C007013) violated
insert into school values ('tue',1,'A',1,1,'eng');
insert into school values ('mon',1,'A',3,1,'math');  -- unique constraint (DXC.SYS_C007013) violated

select * from school;
