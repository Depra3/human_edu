package human07;

public class Taxi extends Car {
	public Taxi() {
		System.out.println("Taxi() 객체 생성");
	}
	
	@Override
	public int getCharge() {
		int charge = 8000;
		System.out.printf("택시교통요금 : %d\n",charge);
		return charge;
	}
	
	public void taxiRun() {
		System.out.println("택시가 달립니다.");
	}

}
