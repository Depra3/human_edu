-- 8��
-- Code block
declare
    -- ������  Ÿ��;
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
    -- ���� || ���ڿ� => X
    -- to_char(����) || ���ڿ� => O
    -- Toad, MySQL Workbench
--    select employee_id,emp_name from employees; �׳� ���� ����
    select employee_id, emp_name
        into v_employee_id, vs_emp_name
    from employees where employee_id=100;
    dbms_output.put_line('���='||to_char(v_employee_id)||', �̸�='||vs_emp_name);
end;
/
set serveroutput on;
select employee_id,emp_name from employees;
desc employees;
--@�μ����̵�=80 -> �μ���,�μ��� ���
select * from departments;
declare
    v_dp_id departments.department_id%type;
    vs_dp_name departments.department_name%type;
    v_dp_mg_id departments.manager_id%type;
begin
    select department_id, department_name,manager_id
        into v_dp_id,vs_dp_name,v_dp_mg_id
    from departments where department_id=80;
    dbms_output.put_line('�μ����̵� = '||to_char(v_dp_id)||', �μ��� = '||vs_dp_name||', �μ��� ��� = '||to_char(v_dp_mg_id));
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
        into name, m_name   --����� �� �ٸ� ���;� ����, �������� Ŀ���� �����
    from departments a, employees b
    where a.department_id=80  
    and a.manager_id=b.employee_id;
    dbms_output.put_line('�μ��� = '||name||', �μ��� ��� = '||m_name);
end;
/
declare
    name departments.department_name%type;
    m_id departments.manager_id%type;
    m_name employees.emp_name%type;
begin
    --������ ���� ��� �и��Ͽ� �����ϴ� ���
    select department_name,manager_id
        into name, m_id --�μ���, �μ��� ���
    from departments 
    where department_id=80;
    
    select emp_name into m_name
    from employees
    where employee_id=m_id;
    dbms_output.put_line('�μ��� = '||name||', �μ��� �̸� = '||m_name);
end;
/

declare
    vn_salary employees.salary%type;
    vn_did departments.department_id%type;
begin
    vn_did := round(dbms_random.value(10,120),-1); -- -1 �Ҽ��� ù°�ڸ� / round �ݿø�
    select salary into vn_salary from employees where department_id=vn_did and rownum=1;  -- rownum(�ǻ�Į��)���� ù��° ������ ������
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
    vn_did := round(dbms_random.value(10,120),-1); -- -1 �Ҽ��� ù°�ڸ� / round �ݿø�
    select salary into vn_salary from employees where department_id=vn_did and rownum=1;  -- rownum(�ǻ�Į��)���� ù��° ������ ������
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
--@�� �ڵ带 case��
declare
    vn_salary employees.salary%type;
    vn_did departments.department_id%type;
begin
    vn_did := round(dbms_random.value(10,120),-1); -- -1 �Ҽ��� ù°�ڸ� / round �ݿø�
    select salary into vn_salary from employees where department_id=vn_did and rownum=1;  -- rownum(�ǻ�Į��)���� ù��° ������ ������
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
        vn := vn + 1; -- ++���� ���� �����ڴ� ����
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
        vn := vn + 1; -- ++���� ���� �����ڴ� ����
        exit when vn=10;
    end loop;
end;
/
declare
    vn number := 0;
begin
    loop
        dbms_output.put_line(vn);
        vn := vn + 1; -- ++���� ���� �����ڴ� ����
        exit when vn=10;
    end loop;
end;
/
--@1~9 ������
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
--@������ loop
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
-- ���ν���
create or replace procedure department_info(d_id departments.department_id%type)
is
    name departments.department_name%type;
    m_id departments.manager_id%type;
    m_name employees.emp_name%type;
begin
    select department_name,manager_id
        into name, m_id --�μ���, �μ��� ���
    from departments 
    where department_id=d_id;
    
    select emp_name into m_name
    from employees
    where employee_id=m_id;
    dbms_output.put_line('�μ��� = '||name||', �μ��� ��� = '||m_name);
end;
/
exec department_info(40);
drop procedure depart;

--@���ν��� 1 gugu(dan)
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
--@���ν��� 2 �μ��� �ο���
create or replace procedure howmany1(d_id departments.department_id%type)
is
    cnt number:=0;
begin
    select  count(*)
        into  cnt --�μ���, �μ��� ���
    from  employees a
    where a.department_id=d_id;
    dbms_output.put_line('�ο��� = '||to_char(cnt));
end;
/
exec howmany1(50);

select count(*) from employees where department_id=80;
--�μ��� + �ο���
--create or replace procedure howmany2(d_id departments.department_id%type:=80) - default�� ����
create or replace procedure howmany2(d_id departments.department_id%type)
is
    cnt number;
    name departments.department_name%type;
begin
    select b.department_name, count(*)
        into  name,cnt --�μ���, �μ��� ���
    from  employees a, departments b
    where a.department_id=d_id
    and b.department_id=d_id
    group by b.department_name;
    dbms_output.put_line('�μ��� = '||name||', �ο��� = '||to_char(cnt));
end;
/
exec howmany2(80);
drop procedure howmany;
select * from employees;
select * from departments order by parent_id;
--@�μ��ڵ� �Է� - �� �μ��� �����μ� �ο���
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
    dbms_output.put_line('�ο��� = '||to_char(cnt1)||' '||to_char(cnt2)||' '||to_char(cnt1+cnt2));
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
--    dbms_output.put_line('�ο��� = '||to_char(cnt1)||' '||to_char(cnt2)||' '||to_char(cnt1+cnt2));
    dbms_output.put_line('�ο��� = '||to_char(cnt1));
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

--�Լ� function
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
--join�� �ȵǴ� ���� �ȳ���
--Left Outer Join���� ������ �� �� ����(Left, Right ����)

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
--���� ���
select * from departments;
select * from employees;
--@�μ��ڵ� �Է� , �μ��� / �μ����̸� / �μ� �ο���
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