package human07;

public class Bus extends Car {
	
	public Bus() {
		System.out.println("Bus() 객체 생성");
	}
	
	@Override
	public int getCharge() {
		int charge = 1450;
		this.money = charge;
		System.out.printf("버스교통요금 : %d\n",charge);
		return charge;
	}
	public void busRun() {
		System.out.println("버스가 달립니다.");
	}

}
