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
--@commission_pct별 인원수
select commission_pct pct,count(*) cnt,to_char(avg(salary),'99,999.99') avg_sal
from worker
where commission_pct is not null
--null이 아닌 것만
group by commission_pct
order by avg(salary);

select * from worker order by salary desc;
select * from worker order by hire_date desc;
select * from worker order by salary asc;
select * from worker order by hire_date asc;

select * from customers;

--@성별에 따른 수
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

--@결혼 여부별 고객 수를 알파벳 순으로 정렬
select lower(cust_marital_status), count(*)
    from customers
    group by lower(cust_marital_status)
    order by lower(cust_marital_status) asc;
    
update customers
set cust_marital_status='single'
where cust_marital_status='single';
--버전이나 프로그램에 따라 다름. 수행하거나 수행하지 않고 수행했다고 로그를 띄움.

select * from customers;
--@생년별 고객수 오름차순 + 성별
select cust_year_of_birth bitrh,cust_gender gender, count(*)
from customers
group by cust_year_of_birth, cust_gender
order by cust_year_of_birth, cust_gender asc;
--order by에서 cust_gender가 굳이 없어도 똑같은 결과가 나옴.

select substr(emp_name,1,1) one from worker order by one; --힌트
--@이름 첫자가 같은 사람이 몇명인지 조회
select substr(emp_name,1,1) one,count(*)
from worker
group by substr(emp_name,1,1)
order by one;

select * from worker order by salary desc;
--@월급대별 인원수
select floor(salary/1000)*1000 zone, count(*) cnt
from worker
group by floor(salary/1000)
order by zone;
--order by cnt;

create table exp_goods_asia(
country varchar(10),seq number, goods varchar2(80));
desc exp_goods_asia;
insert into exp_goods_asia values('한국',1,'원유제외 석유류');
insert into exp_goods_asia values('한국',2,'자동차');
insert into exp_goods_asia values('한국',3,'전자집적회로');
insert into exp_goods_asia values('한국',4,'선박');
insert into exp_goods_asia values('한국',5,'LCD');
insert into exp_goods_asia values('한국',6,'자동차부품');
insert into exp_goods_asia values('한국',7,'휴대전화');
insert into exp_goods_asia values('한국',8,'환식탄화수소');
insert into exp_goods_asia values('한국',9,'무선송신기 디스플레이 부속품');
insert into exp_goods_asia values('한국',10,'철 또는 비합금강');
insert into exp_goods_asia values('일본',1,'자동차');
insert into exp_goods_asia values('일본',2,'자동차부품');
insert into exp_goods_asia values('일본',3,'전자집적회로');
insert into exp_goods_asia values('일본',4,'선박');
insert into exp_goods_asia values('일본',5,'반도체웨이퍼');
insert into exp_goods_asia values('일본',6,'화물차');
insert into exp_goods_asia values('일본',7,'원유제외 석유류');
insert into exp_goods_asia values('일본',8,'건설기계');
insert into exp_goods_asia values('일본',9,'다이오드,트랜지스터');
insert into exp_goods_asia values('일본',10,'기계류');
select * from exp_goods_asia;
select * from exp_goods_asia order by goods;

--교집합
select goods from exp_goods_asia where country='한국'
intersect
select goods from exp_goods_asia where country='일본';

--합집합
select goods from exp_goods_asia where country='한국'
--union
union all
select goods from exp_goods_asia where country='일본' order by goods;

--차집합
select goods from exp_goods_asia where country='한국'
minus
select goods from exp_goods_asia where country='일본';

--@(A U B) - (A n B)
(select goods from exp_goods_asia where country='한국'
union
select goods from exp_goods_asia where country='일본')
minus
(select goods from exp_goods_asia where country='한국'
intersect
select goods from exp_goods_asia where country='일본');

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
--@worker 테이블을 기준으로 해서 조인 -> 사원명(worker.emp_name), 직위명(jobs.job_title) 출력
select worker.emp_name, worker.job_id, jobs.job_title
from worker, jobs
where worker.job_id=jobs.job_id;
--alias name 적용
select w.emp_name, w.job_id, j.job_title
from worker w, jobs j
where w.job_id=j.job_id;

select distinct prod_id from sales order by prod_id;

select * from roomtype;
select * from roominfo;
insert into roominfo values(101,'지리산',2,7,1500);
insert into roominfo values(102,'설악산',4,8,1800);
insert into roominfo values(103,'한라산',3,5,1600);
--@roominfo의 모든 컬럼을 표시 (type은 roomtypename으로 표시)
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
--@sales테이블의 prod_id를 product_name으로 바꾼다(by Join with Products테이블)
--(prod_id)prod_name,cust_id,channel_id,employee_id
select p.prod_name, s.cust_id, s.channel_id, s.employee_id
--select count(*)
from sales s, products p
where s.prod_id = p.prod_id;

--select p.prod_name, c.cust_name, ch.channel_desc, s.employee_id
select count(*) --확인용- 기존의 record수의 변동이 없어야함.
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
--sales에 1이 있고 employees에는 없어서 개수차이가 생김. 무결성에 문제가 있음

select count(*) from sales where employee_id not in(select employee_id from employees);

--group by + join
--@상품당 매출액
select b.prod_name, to_char(sum(a.amount_sold),'999,999,999,999.99')
--select b.prod_name, to_char(a.amount_sold,'999,999,999,999.99') -- sum은 group by와 연계
from sales a, products b
where a.prod_id=b.prod_id
group by b.prod_name
order by b.prod_name;
--@사번, 매출액
select employee_id, to_char(sum(amount_sold),'999,999,999,999.99')
from sales
group by employee_id;

--@(사번)직원명, 매출액
select b.emp_name, to_char(sum(a.amount_sold),'999,999,999,999.99')
from sales a, employees b
where a.employee_id=b.employee_id
group by b.emp_name
order by b.emp_name;