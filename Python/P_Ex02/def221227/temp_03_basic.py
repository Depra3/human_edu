# -*- coding: utf-8 -*-
# 컨텍스트 매니저
# 파티 식당 종업원
# - 테이블 세팅
# - 손님 식사 주문 / 식사
# - 테이블 닦고 / 테이블 정리 / 다음 손님 맞을 준비

# 활용 예제
# 데이터를 모음 --> 업데이트 / DB 작업후 종료


def main():
    with open("data/my_file.txt") as my_file:
        text = my_file.read()
        text_length = len(text)
    # with절 역할 : 파일을 열고 처리 완료 후 종료

    print("파일 글자 총 길이는 {}과 같다.".format(text_length))

if __name__ == "__main__":
    main()