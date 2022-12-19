package human11;

public class Buyer {
	public int money; // 잔액
	public Product[] cart = new Product[30];
	public int index; // cart index

	public Buyer(int money) {
		this.money = money;
		this.index = 0;
	}

	public void buy(Product p) {
		// 입력받아 사는 형태가 아님 - 따라서 반복문 필요 X
		// 입력받아 사는 형태라도 반복분 필요 X - 메인에서 반복
		// Product p = tv (자동타입변환)
		// Product p = audio (자동타입변환)
		// Product p = computer (자동타입변환)	
		if (this.money < p.price) {
			System.out.printf("현재 잔액이 %d이기 때문에 제품(%s : %d)을 살 수 없습니다.\n", this.money, p.name, p.price);
			return;		// 종료시킬수있음
		} else {
			add(p);
			this.money = this.money - p.price;
//			this.index++;
//			System.out.printf("cart[%d] : %s\n",  this.index, p.name);
		}		
	}

	private void add(Product p) {
		for (int i = 0; i < cart.length; i++) {
			if (this.cart[i] == null) {
				this.cart[i] = p;
				System.out.printf("cart[%d] : %s(%d)\n", i+1, p.name, p.price);
				break;
			}
		}
//		this.cart[this.index] = p;	//Product 객체 주소 저장
//		this.index++;	// this.index = this.index + 1;			
	}

	public void summary() {
		for (int i = 0; i < cart.length; i++) {
			if (this.cart[i] == null) {				
				break;
			}
			System.out.printf("cart[%d] : %s(%d)\n", i+1, cart[i].name, cart[i].price);
		}
		String itemList = "";		//
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (this.cart[i] == null) {
				break;
			}
			// this.cart[i]는 product 객체
			if (this.cart[i+1] == null) {
				// 배열에서 존재하지 않는 칸에서 오류
				// 문자열 합치기 *
				itemList = itemList + this.cart[i].name;
			}else {
				itemList = itemList + this.cart[i].name + ", ";
			}
			sum = sum + cart[i].price; //
		}
		System.out.printf("구입한 물건 : %s\n", itemList);
		System.out.printf("총 사용 금액 : %d\n", sum); // 1000 - this.money  <-무식
		System.out.printf("현재 잔액 : %d\n", this.money);
	}
}