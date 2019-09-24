conn dxc;  --if table not being sent to Recycle Bin, try running by connecting to hr
select * from tab;

drop table school;
select * from recyclebin;

FLASHBACK table school to before drop;  --to bring back table from recycle bin

--joining tables
select job_history.employee_id, jobs.job_id from job_history inner join jobs on job_history.job_id=jobs.job_id;
select job_history.employee_id, jobs.job_id from job_history full outer join jobs on job_history.job_id=jobs.job_id where jobs.min_salary>7000;

select to_char (SYSDATE, 'MM-DD-YYYY HH24:MI:SS')  --display current date and time
select to_char (SYSDATE, 'MM-DD-YYYY') "CURRENT_DATE" from dual;  --display current date
select to_char (SYSDATE, 'MM/DD/YYYY') "CURRENT_DATE" from dual;  --display current date in DD/MM/YYYY format
select to_char (SYSDATE, 'DAY') "CURRENT_DATE" from dual;  --display current day as Tuesday
select to_char (SYSDATE+10, 'MM-DD-YYYY') "CURRENT+10_DATE" from dual;  --display date after 10 days from the current date

--task
create table Employee(
	EmpFName varchar(20),
	EmpMName varchar(20),
	EmpLastName varchar(20),
	EmpAge int,
	EmpCity varchar(20),
	EmpDesignation varchar(20),
	EmpId varchar(20) primary key,
	empDOB date,
	constraint check_EmpAge CHECK(EmpAge>-1 AND EmpAge<50),
	constraint check_EmpCity CHECK(EmpCity LIKE 'B%'),
	constraint check_EmpDes CHECK(EmpDesignation LIKE '% manager'),
	constraint check_EmpID CHECK(LENGTH(EmpId)=5)
);

insert into Employee values('A','Aa','Aaa','5','Bangalore','A manager','emp01','05-may-1997');
insert into Employee values('B','Ba','Baa','5','Bophal','asdad manager','emp02','22-may-1995');
insert into Employee values('C','Ca','Caa','5','Bombay','acc manager','emp03','14-feb-2008');
insert into Employee values('D','Da','Daa','5','Bristol','finance manager','emp04','29-dec-1990');
insert into Employee values('E','Ea','Eaa','5','Boll','staff manager','emp05','06-june-1980');

UPDATE employee
SET EmpCity = 'Bibibibibibib'
WHERE EmpId = 'emp05';  --update any employe and change city name

DELETE FROM employee
WHERE EmpId='emp04';  --delete an employee

DELETE FROM employee ;  --delete all records
commit; rollback; --to retrive all the deleted entries

select EmpFName , TO_CHAR(empDOB, 'DD-MM-YYYY') from employee;  --display employee  name and dob in(DD-MM-YYYY) fromat

select substr(empfname,1,1)||'.'||substr(empmname,1,1)||'.'||emplastname  from employee;  --output for all names ex. A.A.Aaa for 1st entry


--PLSQL--
---------
SET serveroutput ON

create or replace procedure prcMyProc(val varchar2)
as
begin
dbms_output.put_line('hello proc '||val);
end; /
exec prcMyProc('world');

create table testPrc(col1 varchar(20));

create or replace procedure prcMyProc(val varchar2)
as
begin
insert into testprc values(val);
end; /
exec prcMyProc('world');

select * from testprc;

create or replace procedure prcDate(temp out date, Ip date)
as
Begin
temp:=Ip-10;
end; /

declare
temp date;
Begin
prcDate(temp,'20-may-1997');
dbms_output.put_line(temp);
end; /
