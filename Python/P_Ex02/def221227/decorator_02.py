# -*- coding: utf-8 -*-

def make_something(func):

    def face():
        print("눈 성형 함")
        func() # == normal()
    return face

@make_something # decorator
def normal():
    print("노멀한 얼굴")

if __name__ == "__main__":
    normal()