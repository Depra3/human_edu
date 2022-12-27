# -*- coding:utf-8 -*-
# 클래스 attribute 사용
# 클래스 변수를 정의
# 클래스 메서드 정의

class Employee:

    MIN_SALARY = 20000

    # 인스턴스 생성 시, 입력된 급여와 비교
    # 입력된 급여가 기본값보다 적으면(or 입력하지 않아도) 기본값 부여
    def __init__(self, name, salary=0):
        self.name   = name
        if salary >= Employee.MIN_SALARY:
            self.salary = salary
        else:
            self.salary = Employee.MIN_SALARY
        
    @classmethod
    def from_file(cls, filename):
        with open(filename, "r") as f:
            name = f.read()
        return cls(name)

if __name__ == "__main__":
    emp = Employee.from_file("data/names.txt")
    print(emp.name)