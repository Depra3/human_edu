# -*- coding: utf-8 -*-

# 핵심 주제 : Decorator
# 중첩 함수, 함수를 객체처럼 사용
# 사칙연산을 만들기(중첩 함수, 객체)

def math_function(func_name):
    """사칙연산

    Args:
        func_name(str) : 함수이름 기입

    Return:
        function
    ...
    """

    if func_name == "add":
        def add(a,b):
            return a + b
        return add
    elif func_name == "multiple":
        def multiple(a, b):
            return a * b
        return multiple
    elif func_name == "subtract":
        def subtract(a, b):
            return a - b
        return subtract
    elif func_name == "divide":
        def divide(a, b):
            return a // b
        return divide
    else:
        print("....")

if __name__ == "__main__":
    x = 100
    y = 2

    # closures 개념
    add = math_function("add") # 정의해야 formt쪽에서 사용 가능
    print("100 + 2 = {}".format(add(x,y)))

    subtract = math_function("subtract")
    print("100 - 2 = {}".format(subtract(x,y)))

    multiple = math_function("multiple")
    print("100 * 2 = {}".format(multiple(x,y)))

    divide = math_function("divide")
    print("100 // 2 = {}".format(divide(x,y)))