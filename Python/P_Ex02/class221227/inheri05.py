# -*- coding:utf-8 -*-
# 클래스 attribute 사용
# 클래스 변수를 정의

class Employee:

    MIN_SALARY = 20000

    def __init__(self, name, salary=0):
        self.name   = name
        if salary >= Employee.MIN_SALARY:
            self.salary = salary
        else:
            self.salary = Employee.MIN_SALARY
    
    # 메서드 정의
    def give_raise(self, amount):
        self.salary += amount
        
class Manager(Employee):
    def display(self):
        print("Manager : ", self.name)
    
    def __init__(self, name, salary=50000, project=None):
        Employee.__init__(self, name, salary)
        self.project = project

    def give_raise(self, amount = 0, bonus = 2.00):
        if amount > 0:
            Employee.give_raise(self, amount * bonus)
        else:
            Employee.give_raise(self, amount)

if __name__ == "__main__":
    mng = Manager("Evan")
    print(mng.name)
    print(mng.salary)
    mng.give_raise(20000, bonus = 3.00)
    print(mng.salary)

    # emp1 = Employee("Evan", 60000)
    # emp1.give_raise(5000)
    # print(emp1.name)
    # print(emp1.salary)