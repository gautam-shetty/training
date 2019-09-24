conn /as sysdba --connecting to systemdba
grant create session to dxc;

grant dba to dxc;

create user dxc identified by pass;  -- creating user
conn dxc

create schema authorization dxc;  --creating schema

-- to unlock
alter user hr account unlock;
alter user hr identified by hr account unlock;
--

create table college(
clgid int,
clgName varchar(10),
test char(5)
);

insert into college values(1,'gautam','test1');
insert into college values(2,'aryamann','test2');

select * from college;
select length(clgname), length(test) from college;

--optional
commit;  --to use data in sql developer
--

DESC college;

select * from college where clgname='gautam';
select * from college where upper(clgname)=upper('gautAM');   --to check user data are not case sensitive

select clgName as "college name" from college;
