--drop table student;
--create table student (
--name varchar2(20) not null,
--gender varchar2(6) not null,
--school_name varchar2(12) not null,
--grade_num number(1) not null,
--mobile varchar2(8),
--math_score number(3),
--english_score number(3),
--korean_score number(3)
--);
--desc student;
--drop table person;
--desc person;

--insert into student values('John','Male','WestLake',6,null,null,null,null);
--insert into student values('Jane','Female','RiverWest', 5,null,null,null,null);
--insert into student values('(null)','Female','RiverWest', 5,null,null,null,null);
--insert into student(name,gender,school_name,grade_num) values('Jacob','Male','RiverEast',6);
--delete from student where name='(null)';
--delete from student where name='a';
--delete from student where gender='male';
--insert into student values('a','Female','q',1,null,null,null,null);
--insert into student values('b','Female','w',2,null,null,null,null);
--insert into student values('c','Female','e',3,null,null,null,null);
--insert into student values('d','Female','r',4,null,null,null,null);
--insert into student values('e','Male','t',5,null,null,null,null);
--insert into student values('f','Male','y',6,null,null,null,null);
--insert into student values('g','Male','u',7,null,null,null,null);
--insert into student(name,gender,school_name,grade_num) values('Ja','Male','RiverEast','9');
commit;
rollback;
SELECT * from student;
--delete from student where mobile is null;
--delete from student where grade>6;
--update student set school_name='RiverSouth' where school_name='RiverEast';
--update student set gender='Female' where school_name='RiverEast';
--update student set school_name='RiverSouth' where name='Ja';
--update student set mobile='-' where mobile is null;
--update student set math_score=-1,english_score=-1,korean_score=-1 where grade_num<5;
--select count(*) from sales;
select * from employees;

--create table worker as select * from employees;
select * from worker;
--worker 테이블에서 managier_id가 null인 사람의 월급(salary)을 30000만으로 변경(update)
update worker set salary=30000 where manager_id is null;
--manager_id가 124인 사람의 커미션 퍼센티지를 0.25로 변경
update worker set commission_pct=0.25 where manager_id=124;