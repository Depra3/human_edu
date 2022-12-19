package human13;

public class Taxi extends Car {

	public Taxi(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		this.currentSpeed += 5;
//		this.currentSpeed = this.currentSpeed + 5;
	}

	@Override
	public int getCharge() {
		System.out.println("택시 요금 : 8000");
		return 8000;
	}

}
