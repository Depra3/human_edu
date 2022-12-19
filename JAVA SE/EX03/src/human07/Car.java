package human07;

public class Car {
	public int money;
	public Car() {
		System.out.println("Car() 객체 생성");
	}
	
	public int getCharge() {
		int charge = 1600;
		this.money = charge;
		System.out.printf("일반교통요금 : %d \n",charge);
		return charge;
	}
}
