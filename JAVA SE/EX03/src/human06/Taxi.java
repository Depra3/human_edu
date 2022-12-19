package human06;

public class Taxi extends Car {
	public Taxi() {
		super();// super에 인자가 없는 경우 생략 가능
		System.out.println("TAXI 객체 생성");
	}
	
	public int getCharge() {
		int charge = 8000;
		System.out.printf("택시 요금 : %d \n",charge);
		return charge;
	}

}
