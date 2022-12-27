# -*- coding: utf-8 -*-
# Parameter 정의

# var를 리스트로 정의
def list_a(var=[]):  
    
    # 1을 리스트에 추가
    var.append(1)

    # 결과도 리스트로 정의
    return var

#list_b()가 호출될 때 마다 var=None 선언
def list_b(var=None):
    if var is None:
        var = []
    
    var.append(1)
    return var

# 현재 스크립트 파일이 프로그램의 시작점이 맞는지 판단하는 작업
# ==> 프로그램의 시작
if __name__ == "__main__": 
    print(list_a())
    print(list_a())
    print(list_a())
    print("---------")
    print(list_b())
    print(list_b())
    print(list_b())