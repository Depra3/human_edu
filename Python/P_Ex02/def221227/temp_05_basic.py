# -*- coding: utf-8 -*-

# 함수를 객체로 사용하는 방식
# function as variable

def my_fun():
    print("안녕")

if __name__ == "__main__":
    x = my_fun
    print(type(x))
    print(x())