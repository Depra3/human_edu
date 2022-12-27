# -*- coding: utf-8 -*-
# Parameter 정의

def list_a(var=[]):
    
    # var를 리스트로 정의
    # 1을 리스트에 추가
    var.append(1)

    # 결과도 리스트로 정의
    return var

def list_b(var=None):
    if var is None:
        var = []
    
    var.append(1)
    return var

if __name__ == "__main__": # 현재 파일에 해당 함수가 있는지 확인
    print(list_a())
    print(list_a())
    print(list_a())
    print("---------")
    print(list_b())
    print(list_b())
    print(list_b())