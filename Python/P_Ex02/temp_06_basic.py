# -*- coding: utf-8 -*-

# 다양한 함수를 리스트 안에 넣기
# Dictionary에 추가하기

def my_fun():
    print("안녕")

if __name__ == "__main__":
    list_functions = [my_fun, open, print]
    # open 함수?
    list_functions[2]('전 리스트에 있습니다.')

    dict_functions = {
        "fun_1" : my_fun,
        "fun_2" : open,
        "fun_3" : print
    }
    print(dict_functions['fun_3']('전 딕셔너리에 있습니다.'))