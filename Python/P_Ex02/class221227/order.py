# -*- coding:utf-8 -*-

# from 파일명 import 클래스명 / 함수명 / 변수명(클래스내 변수는 불가함)
from restaurant import Comments, Menus
# from restaurant import temp
# from restaurant import sentence
# from restaurant import terminate_sale

all_menus = [
    {"menu" : "김밥", "price" : 3000},
    {"menu" : "우동", "price" : 5000},
    {"menu" : "라면", "price" : 6000},
    {"menu" : "순대", "price" : 4000}
]

# def main():
#     # text = terminate_sale
#     text = sentence
#     print(text)

class Order(Menus):
    # 클래스 변수 정의
    data    = all_menus
    name    = "김밥천국"
    status  = True

    def __init__(self):
        print(Comments.title % self.name)

    # 메뉴 등록 지정
    def set_products(self):
        Menus.food_names = []
        Menus.food_prices = []

        for food in self.data:
            Menus.food_names.append(food["menu"])
            Menus.food_prices.append(food["price"])
    
    # 전원 버튼
    def run(self):
        # 메뉴 등록 후, 시스템에 반영
        self.set_products()
        while self.status:
            try:
                inputMoney = int(input(Comments.insert_price))
            except ValueError:
                print(Comments.select_error)
            else:
                self.select_menu(inputMoney)

    # 메뉴 선택
    def select_menu(self, money):
        # print("select menu 함수 내 진입")
        print(Comments.select_menu)

        for idx, name in enumerate(Menus.food_names):
            price = Menus.food_prices[idx]
            print(Comments.product_description % (str(idx), name, price))

        inputFood = int(input(Comments.select_menu))
        self.payment(money, inputFood)

    # 가격 처리
    def payment(self, money, idx):
        # print("payment 함수에 진입")
        name = Menus.food_names[idx]
        price = Menus.food_prices[idx]
        if money >= price:
            balance = money - price
            print(Comments.finish_sale % (name, str(balance)))
        else:
            print(Comments.insufficient_price % (name, str(money)))

if __name__ == "__main__":
    # main()
    order = Order()
    # print(order.data)
    # print(order.name)
    # print(order.status)
    try:
        order.run()
    except KeyboardInterrupt:
        order.status = False
        print(Comments.terminate_sale)
