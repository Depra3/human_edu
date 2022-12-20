select * from worker;
select * from employees;
--사번, 이름, 매니저 이름
select a.employee_id, a.emp_name, b.emp_name manager_name
  from employees a, employees b
 where a.manager_id = b.employee_id
 order by a.emp_name;
 
 select * from departments;
 
--@부서코드, 부서명, 상위부서명(departments)
select a.department_id, a.department_name, b.department_name parent_name
from departments a, departments b
where a.parent_id = b.department_id 
order by a.department_id;

--@사번, 이름, 매니저 이름, 부서명 - 셀프조인 + 동등조인
select a.employee_id, a.emp_name, b.emp_name manager_name,d.department_name
from employees a, employees b, departments d
where a.manager_id = b.employee_id
and a.department_id=d.department_id
order by a.employee_id;
 
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a, departments b            --카타시안 곱 1
where a.department_id=b.department_id      --동등 조건   2
and a.salary>6000                          --비교 연산   3
order by a.salary;
-- ↑ == ↓
select a.employee_id, a.emp_name, a.salary, b.department_name
from (select * from employees where salary>6000) a, departments b --서브 쿼리
where a.department_id=b.department_id
order by a.salary;
-- ↑ == ↓(그렇게 좋지 않음)
select a.employee_id, a.emp_name, a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id
and a.employee_id in ( select employee_id from employees where salary>6000)
order by a.salary;

select * from worker;
select * from employees;
select * from departments;

--@사번, 이름, 매니저이름, 부서명, 부서장명
select a.employee_id 사번, a.emp_name 이름, b.emp_name 매니저_이름, d.department_name 부서명, c.emp_name 부서장명
  from employees a, employees b, employees c, departments d
 where a.manager_id = b.employee_id         -- 1
   and a.department_id = d.department_id    -- 2
   and d.manager_id = c.employee_id         -- 3
--   and d.manager_id = b.employee_id
--   and d.manager_id = a.employee_id
-- 같은 테이블이라 하더라도 연결하면 가지고 있는 데이터가 기존의 테이블과 달라 제대로 된 결과가 나오지 않음.
-- 새로운 테이블로 연결해야 제대로 된 결과가 나옴.
-- 1로 인해 a와 b가 가지고 있는 데이터가 기존의 테이블과 다름, 때문에 3에서 같은 새로운 테이블을 이용하여 연결
 order by 이름;
select * from employees;
select * from departments;

--부서명, 인원수
select b.department_name, count(*)
 from employees a, departments b
 where a.department_id=b.department_id
 group by b.department_name
 order by b.department_name;
 
--@부서장, 인원수
select c.department_name, b.emp_name, count(*)
 from employees a,employees b,departments c
 where a.department_id=c.department_id      -- 부서 연결
  and c.manager_id=b.employee_id            -- 사원 번호 연결
 group by c.department_name,b.emp_name      -- ※
 order by c.department_name,b.emp_name;
 
--@부서명, 인원수, 월급 총액
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

--ANSI조인
--기존
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id
and a.salary>6000
order by a.salary;
--ANSI조인(내부)
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a inner join departments b
on a.department_id=b.department_id      --join조건
where a.salary>6000     --filtering
order by a.salary;

--기존(oracle)
select a.department_id, a.department_name, b.department_id parent_name
from departments a, departments b
where a.parent_id = b.department_id(+);
--ANSI조인(외부) only in MySQL
select a.department_id, a.department_name, b.department_id parent_name
from departments a left outer join departments b
on a.parent_id = b.department_id;

--select a.department_id, a.department_name, b.department_id parent_name
--from departments a full outer join departments b
--on a.parent_id = b.department_id;

create view v_six as -- 조건이 많고 코드가 길어지는데 자주 사용되는 코드이면 View를 이용하여 쉽게 불러 올 수 있음
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id(+)
and a.salary>5000;

select * from v_six order by emp_name;
drop view v_six;

--create view v_six as select * from employees where salary>6000;
--select a.employee_id, a.emp_name, a.salary, b.department_name
--from employees a, departments b
--where a.department_id=b.department_id(+); --view를 따로 생성해서 조인해도 보고싶은 데이터를 볼 수 있음. 미完

select avg(salary) from employees;
select emp_name, salary from employees where salary>(select avg(salary) from employees)
order by salary;
-- subquery에는 order by 사용 할 수 없다.

select a.emp_name, b.department_name, c.emp_name captain
from employees a, departments b, employees c
where a.department_id=b.department_id(+)
and b.department_name like '%부'
and b.manager_id = c.employee_id;

--@직원명, 부서명, 부서장명 by subquery **
select c.emp_name, c.department_name, d.emp_name captain
from (select a.manager_id cp_id, b.department_name,a.emp_name 
        from employees a, departments b 
        where a.department_id=b.department_id and b.department_name like '%부') c, employees d
where c.cp_id = d.employee_id(+);
--부적합한 열 이름-> 같은 칼럼명 존재 따라서 다른 하나는 별명을 지정해줘야 함.
-- from 2
select a.emp_name, d.department_name, d.emp_name captain
from employees a,(select b.department_id dp_id, c.emp_name, b.department_name
                    from departments b, employees c
                   where b.department_name like '%부'
                     and b.manager_id = c.employee_id) d
where a.department_id(+)=d.dp_id;
-- from 3
select a.emp_name, d.department_name, d.emp_name captain
from employees a,(select b.department_id dp_id, c.emp_name, b.department_name
                    from departments b, employees c
                   where b.department_name like '%부'
                     and b.manager_id = c.employee_id(+)) d
where a.department_id=d.dp_id;
-- from 4
select a.emp_name, b.department_name, c.emp_name captain
  from employees a, 
        (select department_id, department_name, manager_id captain_id
          from departments
         where department_name like '%부') b,
        employees c
 where a.department_id=b.department_id
  and b.captain_id=c.employee_id(+);
-- where
select a.emp_name, b.department_name, c.emp_name captain
 from employees a, departments b, employees c
 where a.department_id in (select department_id
                            from departments
                            where department_name like '%부')
and a.department_id=b.department_id(+)
and b.manager_id=c.employee_id(+);

--create table book( --booking 예약하다(구어체)
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