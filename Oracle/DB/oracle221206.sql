select * from departments;
select * from employees where department_id>110;
--@부서코드 입력 , 부서명 / 부서장이름 / 부서 인원수
create or replace function getDname(d_id departments.department_id%type)
return departments.department_name%type
is
    Dname departments.department_name%type;
begin
    select department_name 
        into Dname 
    from departments 
    where department_id=d_id;
    return Dname;
end;
/
select getDname(10) from dual;
create or replace function getMname(d_id departments.department_id%type)
return employees.emp_name%type
is
    Mname employees.emp_name%type;
    
    m_id departments.manager_id%type;
    
begin
--    select a.emp_name
--        into Mname
--    from employees a,departments b
--    where b.department_id=d_id
--    and b.manager_id=a.employee_id;
    
        select manager_id into m_id
        from departments
        where department_id=d_id;
        if m_id is null then
            Mname:='없음';
        else
            select emp_name into Mname
            from employees
            where employee_id=m_id;
        end if;
    
    return Mname;
end;
/

create or replace function getCnt(d_id employees.department_id%type)
--create or replace function getCnt(d_id departments.department_id%type)
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
select * from user_procedures;
select department_name,getCnt(department_id) from departments;
select department_id, getDname(department_id) dp_name, getMname(department_id) ep_name, getCnt(department_id) cnt
from departments;

declare
    vs_emp_name employees.emp_name%type;
begin
    select emp_name into vs_emp_name    -- 오직 하나의 레코드가 찾아졌을 때만 사용.
    from employees
    where employee_id=124;
    dbms_output.put_line(vs_emp_name);
end;
/
-- version 1
declare
    vs_emp_name employees.emp_name%type;
    cursor c1(vn number)
    is
        select emp_name from employees where employee_id>vn; -- 선언
begin
    open c1(200); -- 열기(실행)
    loop
        fetch c1 into vs_emp_name; -- 사용
        exit when c1%notfound; -- 찾지 못하면 loop 나가기
        
        dbms_output.put_line(vs_emp_name);
    end loop;
    close c1; -- 닫기 -- 메모리 공간 사라짐
end;
/
select emp_name from employees where employee_id>200;
declare
    vs_emp_name employees.emp_name%type;
    vn_emp_id employees.employee_id%type;
    cursor c1(vn number)
    is
        select employee_id, emp_name from employees where employee_id>vn; -- 선언
begin
    open c1(200); -- 열기(실행)
    loop
        fetch c1 into vn_emp_id, vs_emp_name; -- 사용
        exit when c1%notfound; -- 찾지 못하면 loop 나가기
        
        dbms_output.put_line(to_char(vn_emp_id)||', '||vs_emp_name);
    end loop;
    close c1; -- 닫기 -- 메모리 공간 사라짐
end;
/
-- version 2
declare
    cursor c1(vn number)
    is
        select employee_id, emp_name from employees where employee_id>vn;
begin
    for rec in c1(200)
    loop
        dbms_output.put_line(rec.employee_id||', '||rec.emp_name);
    end loop;
end;
/
-- version 3
declare   
begin
    for rec in (select employee_id, emp_name from employees where employee_id>200)
    loop
        dbms_output.put_line(rec.employee_id||', '||rec.emp_name);
    end loop;
end;
/
declare
    m_name employees.emp_name%type;
begin
    for rec in (select employee_id, emp_name,manager_id from employees where employee_id>200)
    loop
        select emp_name into m_name
        from employees
        where employee_id=rec.manager_id;
        dbms_output.put_line(rec.employee_id||', '||rec.emp_name||', '||m_name);
    end loop;
end;
/

--@모든 직원 각각의 사번, 이름, 매니저 이름, 소속 부서명 출력 커서
--1
declare
begin
    for rec in (select a.employee_id, a.emp_name, b.emp_name m_name, c.department_name
                from employees a, employees b, departments c
                where a.manager_id=b.employee_id
                and a.department_id=c.department_id(+)
                union
                select a.employee_id, a.emp_name, '사장',c.department_name
                from employees a, employees b, departments c
                where a.department_id=c.department_id
                and a.manager_id is null)
    loop
        dbms_output.put_line(rec.employee_id||', '||rec.emp_name||', '||rec.m_name||', '||rec.department_name);
    end loop;
end;
/
--2
select * from employees order by employee_id;
declare
    dp_name departments.department_name%type;
begin
    for rec in (select a.employee_id, a.emp_name, b.emp_name m_name, b.department_id d_id
                from employees a, employees b
                where a.manager_id=b.employee_id(+) order by a.employee_id)
    loop
        if rec.d_id is null then
            dp_name:='없음';
            continue;
        else
            select department_name
            into dp_name
            from departments
            where department_id=rec.d_id;
        end if;
        dbms_output.put_line(rec.employee_id||', '||rec.emp_name||', '||rec.m_name||', '||dp_name);
    end loop;
end;
/
select a.employee_id, a.emp_name, b.emp_name m_name, a.department_id d_id
                from employees a, employees b
                where a.manager_id=b.employee_id(+) order by a.employee_id;
                
for rec in (select manager_id from employees)
    loop
        if rec.manager_id is null then
            vs_name:='없음';
        else        
            select  emp_name
            into vs_name
            from employees
            where employee_id=rec.manager_id;
        end if;
        
        dbms_output.put_line(rec.employee_id||', '||rec.emp_name||', '||rec.m_name||', '||dp_name);
    end loop;