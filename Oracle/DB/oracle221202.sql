select * from worker;
select * from employees;
--���, �̸�, �Ŵ��� �̸�
select a.employee_id, a.emp_name, b.emp_name manager_name
  from employees a, employees b
 where a.manager_id = b.employee_id
 order by a.emp_name;
 
 select * from departments;
 
--@�μ��ڵ�, �μ���, �����μ���(departments)
select a.department_id, a.department_name, b.department_name parent_name
from departments a, departments b
where a.parent_id = b.department_id 
order by a.department_id;

--@���, �̸�, �Ŵ��� �̸�, �μ��� - �������� + ��������
select a.employee_id, a.emp_name, b.emp_name manager_name,d.department_name
from employees a, employees b, departments d
where a.manager_id = b.employee_id
and a.department_id=d.department_id
order by a.employee_id;
 
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a, departments b            --īŸ�þ� �� 1
where a.department_id=b.department_id      --���� ����   2
and a.salary>6000                          --�� ����   3
order by a.salary;
-- �� == ��
select a.employee_id, a.emp_name, a.salary, b.department_name
from (select * from employees where salary>6000) a, departments b --���� ����
where a.department_id=b.department_id
order by a.salary;
-- �� == ��(�׷��� ���� ����)
select a.employee_id, a.emp_name, a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id
and a.employee_id in ( select employee_id from employees where salary>6000)
order by a.salary;

select * from worker;
select * from employees;
select * from departments;

--@���, �̸�, �Ŵ����̸�, �μ���, �μ����
select a.employee_id ���, a.emp_name �̸�, b.emp_name �Ŵ���_�̸�, d.department_name �μ���, c.emp_name �μ����
  from employees a, employees b, employees c, departments d
 where a.manager_id = b.employee_id         -- 1
   and a.department_id = d.department_id    -- 2
   and d.manager_id = c.employee_id         -- 3
--   and d.manager_id = b.employee_id
--   and d.manager_id = a.employee_id
-- ���� ���̺��̶� �ϴ��� �����ϸ� ������ �ִ� �����Ͱ� ������ ���̺�� �޶� ����� �� ����� ������ ����.
-- ���ο� ���̺�� �����ؾ� ����� �� ����� ����.
-- 1�� ���� a�� b�� ������ �ִ� �����Ͱ� ������ ���̺�� �ٸ�, ������ 3���� ���� ���ο� ���̺��� �̿��Ͽ� ����
 order by �̸�;
select * from employees;
select * from departments;

--�μ���, �ο���
select b.department_name, count(*)
 from employees a, departments b
 where a.department_id=b.department_id
 group by b.department_name
 order by b.department_name;
 
--@�μ���, �ο���
select c.department_name, b.emp_name, count(*)
 from employees a,employees b,departments c
 where a.department_id=c.department_id      -- �μ� ����
  and c.manager_id=b.employee_id            -- ��� ��ȣ ����
 group by c.department_name,b.emp_name      -- ��
 order by c.department_name,b.emp_name;
 
--@�μ���, �ο���, ���� �Ѿ�
select b.department_name, count(*), sum(a.salary)
 from employees a, departments b
 where a.department_id=b.department_id
 group by b.department_name
 order by b.department_name;

select a.employee_id, a.emp_name, b.emp_name manager_name
from employees a, employees b
where a.manager_id = b.employee_id(+);

select a.department_id, a.department_name, b.department_id parent_name
from departments a, departments b
where a.parent_id = b.department_id(+);

--ANSI����
--����
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id
and a.salary>6000
order by a.salary;
--ANSI����(����)
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a inner join departments b
on a.department_id=b.department_id      --join����
where a.salary>6000     --filtering
order by a.salary;

--����(oracle)
select a.department_id, a.department_name, b.department_id parent_name
from departments a, departments b
where a.parent_id = b.department_id(+);
--ANSI����(�ܺ�) only in MySQL
select a.department_id, a.department_name, b.department_id parent_name
from departments a left outer join departments b
on a.parent_id = b.department_id;

--select a.department_id, a.department_name, b.department_id parent_name
--from departments a full outer join departments b
--on a.parent_id = b.department_id;

create view v_six as -- ������ ���� �ڵ尡 ������µ� ���� ���Ǵ� �ڵ��̸� View�� �̿��Ͽ� ���� �ҷ� �� �� ����
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id(+)
and a.salary>5000;

select * from v_six order by emp_name;
drop view v_six;

--create view v_six as select * from employees where salary>6000;
--select a.employee_id, a.emp_name, a.salary, b.department_name
--from employees a, departments b
--where a.department_id=b.department_id(+); --view�� ���� �����ؼ� �����ص� ������� �����͸� �� �� ����. ����

select avg(salary) from employees;
select emp_name, salary from employees where salary>(select avg(salary) from employees)
order by salary;
-- subquery���� order by ��� �� �� ����.

select a.emp_name, b.department_name, c.emp_name captain
from employees a, departments b, employees c
where a.department_id=b.department_id(+)
and b.department_name like '%��'
and b.manager_id = c.employee_id;

--@������, �μ���, �μ���� by subquery **
select c.emp_name, c.department_name, d.emp_name captain
from (select a.manager_id cp_id, b.department_name,a.emp_name 
        from employees a, departments b 
        where a.department_id=b.department_id and b.department_name like '%��') c, employees d
where c.cp_id = d.employee_id(+);
--�������� �� �̸�-> ���� Į���� ���� ���� �ٸ� �ϳ��� ������ ��������� ��.
-- from 2
select a.emp_name, d.department_name, d.emp_name captain
from employees a,(select b.department_id dp_id, c.emp_name, b.department_name
                    from departments b, employees c
                   where b.department_name like '%��'
                     and b.manager_id = c.employee_id) d
where a.department_id(+)=d.dp_id;
-- from 3
select a.emp_name, d.department_name, d.emp_name captain
from employees a,(select b.department_id dp_id, c.emp_name, b.department_name
                    from departments b, employees c
                   where b.department_name like '%��'
                     and b.manager_id = c.employee_id(+)) d
where a.department_id=d.dp_id;
-- from 4
select a.emp_name, b.department_name, c.emp_name captain
  from employees a, 
        (select department_id, department_name, manager_id captain_id
          from departments
         where department_name like '%��') b,
        employees c
 where a.department_id=b.department_id
  and b.captain_id=c.employee_id(+);
-- where
select a.emp_name, b.department_name, c.emp_name captain
 from employees a, departments b, employees c
 where a.department_id in (select department_id
                            from departments
                            where department_name like '%��')
and a.department_id=b.department_id(+)
and b.manager_id=c.employee_id(+);

--create table book( --booking �����ϴ�(����ü)
book_num number primary key,
num number references roomtype(typenum),
start_dt varchar2(30),
end_dt varchar2(30),
howmany number,
price number,
booker ~~,
mobile varchar2(8)
);

--create table menu(
num number primary key,
name varchar2(20),
price number
);

--create table sales(
selltime varchar2(30) primary key,
mobile varchar2(8),
num number references menu(num),
gty ,
total number
);