package human06;

public class Bus extends Car{
	public Bus() {
		super();
		System.out.println("BUS 객체 생성");
	}
	
	public int getCharge() {
		int charge = 1300;
		System.out.printf("버스 요금 : %d \n",charge);
		return charge;
	}

}
