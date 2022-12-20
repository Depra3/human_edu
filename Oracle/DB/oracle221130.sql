--create table person(
--name varchar2(20),
--gender varchar2(6),
--mobile varchar2(8) primary key,
--address varchar2(30),
--city varchar2(20)
--);

create table roomtype(
typenum number(3) primary key,
typename varchar2(20) not null,
comments varchar2(32)
);
desc roomtype;
create table roominfo(
num varchar2(10) primary key,
name varchar2(20) not null,
type number(3),
howmany number(3) default 1,
howmuch number(4) default 0, 
constraint fk_typenum foreign key(type) references roomtype(typenum)
);
create table roominfo(
num number(3) primary key,
name varchar2(20) not null,
type number(3),
howmany number(3) default 1,
howmuch number(4) default 0, 
constraint fk_typenum foreign key(type) references roomtype(typenum)
);
--insert into roomtype values(1,'Suite Room',null);
--insert into roomtype values(2,'Deluxe Room',null);
--insert into roomtype values(3,'Family Room',null);
--select * from roomtype;
--insert into roominfo values(100, '��λ�', 1,6,1200);
--select * from roominfo;
--insert into roominfo values(100, '�Ѷ��', 4,6,1200);
--���� ���� 1~3�����ۿ� ���� ���� 4�� �ȵ�.
--insert into roominfo values(100, '�Ѷ��', 2,6,1200);

select * from worker;
create view under_five as select * from worker where salary<5000;
select * from under_five;

select * from worker where emp_name='Pat Fay';
create index ndx_emp_name on worker(emp_name);
--select /* index �ε����� */ from ���̺��
--select /* index �ε����� */ from ���̺�� where emp_name='~~'; 
--�ε��� ȿ���� ���� ���ؼ��� ���� �����Ͱ� �־����. ���� �����ͷδ� �ӵ����� ũ�� ����.
--���� Į������ �ε����� ����� Į���� �������� ȣ��� ����ϱ⵵��.

select * from employees;
create table worker as select * from employees;
create synonym human_resource for employees;
select * from human_resource;

create sequence seq_id;
select seq_id.nextval from dual;
desc roomtype;
select * from roomtype;
insert into roomtype values(seq_id.nextval,'Corridor',null);

select * from worker;
--���� ������.
select emp_name||','||salary from worker;
--���: pat, 2000

--�̸�:�Ŵ������,����
select emp_name ||' : '|| employee_id ||', '||salary from worker;

--dual ��¥���̺�, mysql���� from dual �ʿ����.
select 1+5 from dual;
select 10/2 from dual;
select 3*5 from dual;
select * from roominfo;

select employee_id, salary,
    case when salary<=5000 then 'C'
        when salary>5000 and salary <=15000 then 'B'
        else 'A'
    end as salary_level
from worker;

select emp_name, salary,
    case when salary>=10000 then '�������'
        when salary<10000 and salary>=6000 then '�����'
        when salary<6000 then '������'
        --else '������'
    end as salary_level
from worker;

select emp_name, salary from worker where salary between 4000 and 6000;
select emp_name, salary from worker where salary>=4000 and salary>=6000;

select emp_name, salary from worker where salary in (3000,4000,5000,6000,7000);

-- % : 0�� �̻��� ����, _ : 1���� ����
select emp_name from worker where emp_name like 'J%';
select emp_name from worker where emp_name like '%son';
select emp_name from worker where emp_name like '% A%';
--ac
select emp_name from worker where emp_name like '%ac%';
select emp_name from worker where emp_name like 'J___ %';
select emp_name from worker where emp_name like '%ing%';

select ceil(3.14) from dual;
select floor(3.14) from dual;
select power(4,2) from dual;
select sqrt(16) from dual;

select initcap('good') from dual;
select lower(emp_name) from worker;
select upper(emp_name) from worker;
select concat(concat(emp_name,','),salary) from worker;
--�� ���ڿ� �����̶� �� ��� X, ||�� ���� ���
select substr('good morning',5) from dual;
select '['||substr('good morning',1,4)||']' from dual;
select substr('good morning',-3) from dual;
select emp_name from worker where substr(emp_name,-3)='son';
select emp_name from worker where emp_name like '%son';
select replace ('Good Morning Vietnam', 'Morning', 'Evening') from dual;
select emp_name from worker where emp_name like 'John%';
select replace(emp_name,'John ', 'John-') from worker;
select replace(emp_name,'John ', 'John-') from worker where emp_name like 'John%';
select replace(emp_name,' ', '') from worker where emp_name like 'John%';
select instr('���� ���� �ܷο� ����, ���� ���� ���ο� ����, ���� ���� ��ſ� ����','����') from dual;
select instr('���� ���� �ܷο� ����, ���� ���� ���ο� ����, ���� ���� ��ſ� ����','����',5) from dual;
select instr('���� ���� �ܷο� ����, ���� ���� ���ο� ����, ���� ���� ��ſ� ����','����',5,2) from dual;
select instr('John Wick','Wick') from dual; --6
select instr('John Wick','Joe') from dual; --0
select length('Good Morning Vietnam') from dual;
select emp_name, length(emp_name) from worker;

select emp_name from worker;
-- �̸� �� select name, family name
select '['||substr(emp_name,1,instr(emp_name,' ')-1)||']', substr(emp_name,instr(emp_name,' ')) from worker;
-- ���������̱⿡ -1�Ͽ� ���� ����
-- �̸�(�̸�, ������)���� �̸��� �����ؼ� ��� by using instr/substr/length
select emp_name, substr(emp_name,instr(emp_name,' ')+1) from worker;
-- ���������̱⿡ +1�Ͽ� ���� ����
select replace(emp_name,' ','-') from worker;
select to_char(salary,'99,999') from worker;
select sysdate, systimestamp from dual;
select to_char(sysdate,'yyyy-mm-dd HH24:MI:SS') from dual;
select to_char(systimestamp,'yyyy-mm-dd HH24:MI:SS') from dual;
-- sysdate�� �̿��ؼ�, 'pm x�� x�� x��'
--select to_char(systimestamp,'PM HH12'||'��'||' MI'||'��'||' SS'||'��') from dual; ���ڿ��� ����
--select to_char(systimestamp,'PM HH12�� MI�� SS��') from dual;        �׳� ���� �Ⱥ���
select to_char(systimestamp,'PM HH12"��" MI"��" SS"��"') from dual;
select to_char(sysdate,'PM HH12"��" MI"��" SS"��"') from dual;
select to_char(sysdate,'PM HH')||'��'||to_char(sysdate,'MI')||'��'||to_char(sysdate,'SS')||'��' from dual;

select name,gender,school_name,grade_num,mobile,nvl(math_score,-1),nvl(english_score,-1),nvl(korean_score,-1) from student;
select employee_id, to_char(start_date,'yyyy'),to_char(end_date,'yyyy'),
    nullif(to_char(start_date,'yyyy'),to_char(end_date,'yyyy')) nullif_year  --*
from job_history;

select prod_id,
    decode(channel_id, 3, 'Direact', 9, 'Direct', 5, 'Indirect',4,'Indirect','Others') decodes 
from sales where rownum<10;
select emp_name,salary, decode(salary,3000,'3k',4000,'4k',5000,'5k','etc') decodes from worker;
select emp_name,salary, decode(salary,3000,'3õ',4000,'4õ',5000,'5õ','etc') decodes from worker;
select emp_name, salary, case when salary between 3000 and 3999 then '3k' else 'etc' end CWBAT from worker;