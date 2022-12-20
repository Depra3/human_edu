select table_name from user_tables;
select view_name from user_views;
select sequence_name from user_sequences;
select * from worker;
select employee_id eid,emp_name,salary,commission_pct pct,
        to_char(salary*(1+commission_pct/100),'99,999.99') final_salary
from worker 
where commission_pct is not null;

select count(*) from worker;
select sum(salary) from worker;
select to_char(avg(salary),'99,999.99') from worker;
select max(salary) from worker;
select variance(salary) from worker;
select stddev(salary) from worker;

select manager_id,count(*) cnt,sum(salary) total,to_char(avg(salary),'99,999.99') avg_sal
from worker
group by manager_id;

select department_id, count(*)
from worker
group by department_id;

select * from worker;
--@commission_pct�� �ο���
select commission_pct pct,count(*) cnt,to_char(avg(salary),'99,999.99') avg_sal
from worker
where commission_pct is not null
--null�� �ƴ� �͸�
group by commission_pct
order by avg(salary);

select * from worker order by salary desc;
select * from worker order by hire_date desc;
select * from worker order by salary asc;
select * from worker order by hire_date asc;

select * from customers;

--@������ ���� ��
select cust_gender, count(*)
    from customers
    group by cust_gender;
select count(*) from customers where cust_gender='M';
select count(*) from customers where cust_gender='F';

select lower(cust_marital_status), count(*)
    from customers
    group by lower(cust_marital_status);
    
update customers set cust_marital_status='married' where cust_marital_status='Married';
update customers set cust_marital_status='widow' where cust_marital_status='Widowed';
update customers set cust_marital_status='divorced' where cust_marital_status='Divorc';
rollback;

select department_id, count(*) cnt
from worker
--where department_id is not null
group by department_id
having count(*)>1
--order by count(*);
order by cnt desc;

--@��ȥ ���κ� �� ���� ���ĺ� ������ ����
select lower(cust_marital_status), count(*)
    from customers
    group by lower(cust_marital_status)
    order by lower(cust_marital_status) asc;
    
update customers
set cust_marital_status='single'
where cust_marital_status='single';
--�����̳� ���α׷��� ���� �ٸ�. �����ϰų� �������� �ʰ� �����ߴٰ� �α׸� ���.

select * from customers;
--@���⺰ ���� �������� + ����
select cust_year_of_birth bitrh,cust_gender gender, count(*)
from customers
group by cust_year_of_birth, cust_gender
order by cust_year_of_birth, cust_gender asc;
--order by���� cust_gender�� ���� ��� �Ȱ��� ����� ����.

select substr(emp_name,1,1) one from worker order by one; --��Ʈ
--@�̸� ù�ڰ� ���� ����� ������� ��ȸ
select substr(emp_name,1,1) one,count(*)
from worker
group by substr(emp_name,1,1)
order by one;

select * from worker order by salary desc;
--@���޴뺰 �ο���
select floor(salary/1000)*1000 zone, count(*) cnt
from worker
group by floor(salary/1000)
order by zone;
--order by cnt;

create table exp_goods_asia(
country varchar(10),seq number, goods varchar2(80));
desc exp_goods_asia;
insert into exp_goods_asia values('�ѱ�',1,'�������� ������');
insert into exp_goods_asia values('�ѱ�',2,'�ڵ���');
insert into exp_goods_asia values('�ѱ�',3,'��������ȸ��');
insert into exp_goods_asia values('�ѱ�',4,'����');
insert into exp_goods_asia values('�ѱ�',5,'LCD');
insert into exp_goods_asia values('�ѱ�',6,'�ڵ�����ǰ');
insert into exp_goods_asia values('�ѱ�',7,'�޴���ȭ');
insert into exp_goods_asia values('�ѱ�',8,'ȯ��źȭ����');
insert into exp_goods_asia values('�ѱ�',9,'�����۽ű� ���÷��� �μ�ǰ');
insert into exp_goods_asia values('�ѱ�',10,'ö �Ǵ� ���ձݰ�');
insert into exp_goods_asia values('�Ϻ�',1,'�ڵ���');
insert into exp_goods_asia values('�Ϻ�',2,'�ڵ�����ǰ');
insert into exp_goods_asia values('�Ϻ�',3,'��������ȸ��');
insert into exp_goods_asia values('�Ϻ�',4,'����');
insert into exp_goods_asia values('�Ϻ�',5,'�ݵ�ü������');
insert into exp_goods_asia values('�Ϻ�',6,'ȭ����');
insert into exp_goods_asia values('�Ϻ�',7,'�������� ������');
insert into exp_goods_asia values('�Ϻ�',8,'�Ǽ����');
insert into exp_goods_asia values('�Ϻ�',9,'���̿���,Ʈ��������');
insert into exp_goods_asia values('�Ϻ�',10,'����');
select * from exp_goods_asia;
select * from exp_goods_asia order by goods;

--������
select goods from exp_goods_asia where country='�ѱ�'
intersect
select goods from exp_goods_asia where country='�Ϻ�';

--������
select goods from exp_goods_asia where country='�ѱ�'
--union
union all
select goods from exp_goods_asia where country='�Ϻ�' order by goods;

--������
select goods from exp_goods_asia where country='�ѱ�'
minus
select goods from exp_goods_asia where country='�Ϻ�';

--@(A U B) - (A n B)
(select goods from exp_goods_asia where country='�ѱ�'
union
select goods from exp_goods_asia where country='�Ϻ�')
minus
(select goods from exp_goods_asia where country='�ѱ�'
intersect
select goods from exp_goods_asia where country='�Ϻ�');

select * from worker order by salary desc;
select * from departments;
select * from jobs;
select * from sales;
select emp_name,department_id from worker;

select worker.employee_id,worker.emp_name,departments.department_name
from worker, departments
where worker.department_id=departments.department_id;

select a.employee_id,a.emp_name,b.department_name
from worker a, departments b
where a.department_id=b.department_id;
--@worker ���̺��� �������� �ؼ� ���� -> �����(worker.emp_name), ������(jobs.job_title) ���
select worker.emp_name, worker.job_id, jobs.job_title
from worker, jobs
where worker.job_id=jobs.job_id;
--alias name ����
select w.emp_name, w.job_id, j.job_title
from worker w, jobs j
where w.job_id=j.job_id;

select distinct prod_id from sales order by prod_id;

select * from roomtype;
select * from roominfo;
insert into roominfo values(101,'������',2,7,1500);
insert into roominfo values(102,'���ǻ�',4,8,1800);
insert into roominfo values(103,'�Ѷ��',3,5,1600);
--@roominfo�� ��� �÷��� ǥ�� (type�� roomtypename���� ǥ��)
select info.num, info.name, type.typename, info.howmany, info.howmuch
from roominfo info,roomtype type
where info.type=type.typenum
order by num;

select * from sales;
select * from products;
select * from channels;
select * from customers;
select * from employees;
select * from departments;
--@sales���̺��� prod_id�� product_name���� �ٲ۴�(by Join with Products���̺�)
--(prod_id)prod_name,cust_id,channel_id,employee_id
select p.prod_name, s.cust_id, s.channel_id, s.employee_id
--select count(*)
from sales s, products p
where s.prod_id = p.prod_id;

--select p.prod_name, c.cust_name, ch.channel_desc, s.employee_id
select count(*) --Ȯ�ο�- ������ record���� ������ �������.
from sales s, products p, customers c, channels ch
where s.prod_id = p.prod_id and c.cust_id=s.cust_id and ch.channel_id=s.channel_id;

select s.sales_month, p.prod_name, c.cust_name, c.cust_gender, ch.channel_desc, e.emp_name, d.department_name
--select count(*)
from sales s, products p, customers c, channels ch, employees e, departments d
where s.prod_id = p.prod_id 
  and s.cust_id = c.cust_id 
  and s.channel_id = ch.channel_id 
  and s.employee_id = e.employee_id 
  and e.department_id = d.department_id;
--sales�� 1�� �ְ� employees���� ��� �������̰� ����. ���Ἲ�� ������ ����

select count(*) from sales where employee_id not in(select employee_id from employees);

--group by + join
--@��ǰ�� �����
select b.prod_name, to_char(sum(a.amount_sold),'999,999,999,999.99')
--select b.prod_name, to_char(a.amount_sold,'999,999,999,999.99') -- sum�� group by�� ����
from sales a, products b
where a.prod_id=b.prod_id
group by b.prod_name
order by b.prod_name;
--@���, �����
select employee_id, to_char(sum(amount_sold),'999,999,999,999.99')
from sales
group by employee_id;

--@(���)������, �����
select b.emp_name, to_char(sum(a.amount_sold),'999,999,999,999.99')
from sales a, employees b
where a.employee_id=b.employee_id
group by b.emp_name
order by b.emp_name;