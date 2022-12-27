# -*- coding: utf-8 -*-
# 중첩 함수 : 함수 안에 또 다른 함수가 존재

def a():
    x = [3, 6, 9]

    def b(y):
        print(y)

    for value in x:
        b(value)

if __name__ == "__main__":
    a()