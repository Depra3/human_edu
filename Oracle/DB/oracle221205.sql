-- 8장
-- Code block
declare
    -- 변수명  타입;
    vi_num number;
    vi_char char(20);

-- java : final static pi=3.14;
-- SQL : pi CONSTANT:=3.14;
-- java-script : const pi=3.14    

-- Integer-number, Float-number(5,2),char, Boolean
    vs_emp_name employees.emp_name%type;
    v_employee_id employees.employee_id%type;
begin
    vi_num:=100;
    vi_char:='Hello World';
    dbms_output.put_line(vi_num);   --System.out.println()
    dbms_output.put_line(-vi_num);
    dbms_output.put_line(vi_char);
    dbms_output.put_line(2**5);
    -- 숫자 || 문자열 => X
    -- to_char(숫자) || 문자열 => O
    -- Toad, MySQL Workbench
--    select employee_id,emp_name from employees; 그냥 쓰면 오류
    select employee_id, emp_name
        into v_employee_id, vs_emp_name
    from employees where employee_id=100;
    dbms_output.put_line('사번='||to_char(v_employee_id)||', 이름='||vs_emp_name);
end;
/
set serveroutput on;
select employee_id,emp_name from employees;
desc employees;
--@부서아이디=80 -> 부서명,부서장 사번
select * from departments;
declare
    v_dp_id departments.department_id%type;
    vs_dp_name departments.department_name%type;
    v_dp_mg_id departments.manager_id%type;
begin
    select department_id, department_name,manager_id
        into v_dp_id,vs_dp_name,v_dp_mg_id
    from departments where department_id=80;
    dbms_output.put_line('부서아이디 = '||to_char(v_dp_id)||', 부서명 = '||vs_dp_name||', 부서장 사번 = '||to_char(v_dp_mg_id));
end;
/

select a.department_name, b.emp_name manager_name
from departments a, employees b
where a.department_id=80  
and a.manager_id=b.employee_id;

declare
    name departments.department_name%type;
    m_name employees.emp_name%type;
begin
    select a.department_name, b.emp_name manager_name
        into name, m_name   --결과가 한 줄만 나와야 가능, 여러개는 커서를 써야함
    from departments a, employees b
    where a.department_id=80  
    and a.manager_id=b.employee_id;
    dbms_output.put_line('부서명 = '||name||', 부서장 사번 = '||m_name);
end;
/
declare
    name departments.department_name%type;
    m_id departments.manager_id%type;
    m_name employees.emp_name%type;
begin
    --조인이 약할 경우 분리하여 실행하는 방법
    select department_name,manager_id
        into name, m_id --부서명, 부서장 사번
    from departments 
    where department_id=80;
    
    select emp_name into m_name
    from employees
    where employee_id=m_id;
    dbms_output.put_line('부서명 = '||name||', 부서장 이름 = '||m_name);
end;
/

declare
    vn_salary employees.salary%type;
    vn_did departments.department_id%type;
begin
    vn_did := round(dbms_random.value(10,120),-1); -- -1 소수점 첫째자리 / round 반올림
    select salary into vn_salary from employees where department_id=vn_did and rownum=1;  -- rownum(의사칼럼)으로 첫번째 데이터 가져옴
    if vn_salary between 1 and 3000 then
        dbms_output.put_line(to_char(vn_salary)||' = low, '||to_char(vn_did));
    elsif vn_salary between 3001 and 6000 then
        dbms_output.put_line(to_char(vn_salary)||' = middle, '||to_char(vn_did));
    elsif vn_salary between 6001 and 10000 then
        dbms_output.put_line(to_char(vn_salary)||' = high, '||to_char(vn_did));
    else
        dbms_output.put_line(to_char(vn_salary)||' = super, '||to_char(vn_did));
    end if;
end;
/

select min(department_id),max(department_id) from departments;
select * from departments;
select * from employees order by department_id;
select salary from employees where department_id=80;

declare
    vn_salary employees.salary%type;
    vn_did departments.department_id%type;
begin
    vn_did := round(dbms_random.value(10,120),-1); -- -1 소수점 첫째자리 / round 반올림
    select salary into vn_salary from employees where department_id=vn_did and rownum=1;  -- rownum(의사칼럼)으로 첫번째 데이터 가져옴
    if vn_salary between 1 and 3000 then
        dbms_output.put_line(to_char(vn_salary)||' = low, '||to_char(vn_did));
    elsif vn_salary between 3001 and 6000 then
    
        dbms_output.put_line(to_char(vn_salary)||' = middle, '||to_char(vn_did));
    elsif vn_salary between 6001 and 10000 then
        dbms_output.put_line(to_char(vn_salary)||' = high, '||to_char(vn_did));
    else
        dbms_output.put_line(to_char(vn_salary)||' = super, '||to_char(vn_did));
    end if;
end;
/
--@위 코드를 case로
declare
    vn_salary employees.salary%type;
    vn_did departments.department_id%type;
begin
    vn_did := round(dbms_random.value(10,120),-1); -- -1 소수점 첫째자리 / round 반올림
    select salary into vn_salary from employees where department_id=vn_did and rownum=1;  -- rownum(의사칼럼)으로 첫번째 데이터 가져옴
    case
    when vn_salary between 1 and 3000 then
        dbms_output.put_line(to_char(vn_salary)||' = low, '||to_char(vn_did));
    when vn_salary between 3001 and 6000 then
        dbms_output.put_line(to_char(vn_salary)||' = middle, '||to_char(vn_did));
    when vn_salary between 6001 and 10000 then
        dbms_output.put_line(to_char(vn_salary)||' = high, '||to_char(vn_did));
    else
        dbms_output.put_line(to_char(vn_salary)||' = super, '||to_char(vn_did));
    end case;
end;
/
declare
    vn number := 0;
begin
    while vn<10
    loop
        dbms_output.put_line(vn);
        vn := vn + 1; -- ++같은 증감 연산자는 없음
    end loop;
end;
/
declare
    vn number;
begin
    for vn in 0..9 -- 0,1,2,...,9
    loop
        dbms_output.put_line(vn);
    end loop;
end;
/
declare
    vn number;
begin
    for vn in reverse 0..9 -- 9,8,7,...,0
    loop
        dbms_output.put_line(vn);
    end loop;
end;
/
declare
    vn number := 0;
begin
    loop
        dbms_output.put_line(vn);
        vn := vn + 1; -- ++같은 증감 연산자는 없음
        exit when vn=10;
    end loop;
end;
/
declare
    vn number := 0;
begin
    loop
        dbms_output.put_line(vn);
        vn := vn + 1; -- ++같은 증감 연산자는 없음
        exit when vn=10;
    end loop;
end;
/
--@1~9 구구단
declare
    vn1 number;
    vn2 number;
begin
    for vn1 in 0..9
    loop
        for vn2 in 0..9
        loop
            dbms_output.put_line(to_char(vn1)||' * '||to_char(vn2)||' = '||to_char(vn1*vn2));
        end loop;
    end loop;
end;
/
--@구구단 loop
declare
    vn1 number:=1;
    vn2 number:=1;
begin
    loop
        loop
            dbms_output.put_line(to_char(vn1)||' * '||to_char(vn2)||' = '||to_char(vn1*vn2));
            vn2 := vn2 + 1;
            exit when vn2 = 10;
        end loop;
        vn2:=1;
        vn1 := vn1 + 1;
        exit when vn1 = 10;
    end loop;
end;
/
-- 프로시저
create or replace procedure department_info(d_id departments.department_id%type)
is
    name departments.department_name%type;
    m_id departments.manager_id%type;
    m_name employees.emp_name%type;
begin
    select department_name,manager_id
        into name, m_id --부서명, 부서장 사번
    from departments 
    where department_id=d_id;
    
    select emp_name into m_name
    from employees
    where employee_id=m_id;
    dbms_output.put_line('부서명 = '||name||', 부서장 사번 = '||m_name);
end;
/
exec department_info(40);
drop procedure depart;

--@프로시저 1 gugu(dan)
create or replace procedure gugu(dan number)
is
--    vn number;
begin
    for vn in 1..9
    loop
        dbms_output.put_line(to_char(dan)||' * '||to_char(vn)||' = '||to_char(dan*vn));
    end loop;
end;
/
exec gugu(2);
--@프로시저 2 부서내 인원수
create or replace procedure howmany1(d_id departments.department_id%type)
is
    cnt number:=0;
begin
    select  count(*)
        into  cnt --부서명, 부서장 사번
    from  employees a
    where a.department_id=d_id;
    dbms_output.put_line('인원수 = '||to_char(cnt));
end;
/
exec howmany1(50);

select count(*) from employees where department_id=80;
--부서명 + 인원수
--create or replace procedure howmany2(d_id departments.department_id%type:=80) - default값 설정
create or replace procedure howmany2(d_id departments.department_id%type)
is
    cnt number;
    name departments.department_name%type;
begin
    select b.department_name, count(*)
        into  name,cnt --부서명, 부서장 사번
    from  employees a, departments b
    where a.department_id=d_id
    and b.department_id=d_id
    group by b.department_name;
    dbms_output.put_line('부서명 = '||name||', 인원수 = '||to_char(cnt));
end;
/
exec howmany2(80);
drop procedure howmany;
select * from employees;
select * from departments order by parent_id;
--@부서코드 입력 - 그 부서의 하위부서 인원수
create or replace procedure howmany3(d_id departments.department_id%type)
is
    cnt1 number;
    cnt2 number;
begin
    select  count(*)
        into  cnt1
    from  employees a
    where a.department_id=d_id;
    
    select count(*)
        into cnt2
    from employees a,departments b
    where b.parent_id=d_id
    and b.department_id=a.department_id;
    dbms_output.put_line('인원수 = '||to_char(cnt1)||' '||to_char(cnt2)||' '||to_char(cnt1+cnt2));
end;
/
exec howmany3(30);
select count(*) from employees where department_id=30;
create or replace procedure howmany4(d_id departments.department_id%type)
is
    cnt1 number;
    cnt2 number;
begin
--    select  count(*)
--        into  cnt1
--    from  employees a
--    where a.department_id=d_id;
--    
--    select count(*)
--        into cnt2
--    from employees a
--    where a.department_id in(select department_id
--                               from departments
--                              where parent_id = d_id);
    select  count(*)
        into  cnt1
    from  employees a
    where a.department_id=d_id
    or a.department_id in(select department_id
                               from departments
                              where parent_id = d_id);
--    dbms_output.put_line('인원수 = '||to_char(cnt1)||' '||to_char(cnt2)||' '||to_char(cnt1+cnt2));
    dbms_output.put_line('인원수 = '||to_char(cnt1));
end;
/
exec howmany4(10);
--
select count(*) from employees
where department_id in(select department_id from departments where parent_id=10)
union
select count(*) from employees where department_id=10;
--
select count(*) from employees
where department_id in(select department_id from departments where parent_id=10)
or department_id=10;

--함수 function
create or replace function plus(a number, b number)
return number
is
    c number;
begin
    c:=a+b;
    return c;
end;
/
select plus(12,13) from dual;

select b.department_name, sum(a.salary)
from employees a, departments b
where a.department_id(+)=b.department_id
group by b.department_name
order by b.department_name;
--join이 안되는 것은 안나옴
--Left Outer Join으로 나오게 할 수 있음(Left, Right 참고)

create or replace function tot_sal(d_id departments.department_id%type)
return employees.salary%type
is
    total employees.salary%type;
begin
    select sum(salary) into total from employees where department_id=d_id;
    return total;
end;
/
select department_name, tot_sal(department_id)
from departments
order by department_name;
--전부 출력
select * from departments;
select * from employees;
--@부서코드 입력 , 부서명 / 부서장이름 / 부서 인원수
create or replace function getDname(d_id departments.department_id%type)
return departments.department_name%type
is
    Dname departments.department_name%type;
begin
    select department_name into Dname from departments where department_id=d_id;
    return Dname;
end;
/
create or replace function getMname(d_id departments.department_id%type)
return employees.emp_name%type
is
    Mname employees.emp_name%type;
begin
    select a.emp_name
        into Mname
    from employees a,departments b
    where b.department_id=d_id
    and b.manager_id=a.employee_id;
    return Mname;
end;
/
create or replace function getCnt(d_id departments.department_id%type)
return number
is
    cnt number;
begin
    select count(*)
        into cnt
    from employees
    where department_id=d_id;
    return cnt;
end;
/
select getDname(department_id), getMname(department_id), getCnt(department_id)
from departments;