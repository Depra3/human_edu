# -*- coding:utf-8 -*-
# 상속
# 간단 예제
# 라이브러리 클래스 불러와서 새 클래스 만들기

# 데이터 프레임 생성
import pandas as pd

# 상속방법
#        하위           상위
class newDataFrame(pd.DataFrame):
    pass

def main():
    temp_dict = {
        "A" : [1, 2, 3],
        "B" : [4, 5, 6]
    }

    # result = pd.DataFrame(temp_dict)
    # ==
    result = newDataFrame(temp_dict)
    print(result)

if __name__ == "__main__":
    main()