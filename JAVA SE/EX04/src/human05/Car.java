package human05;

public class Car {
	// 1. 멤버변수
	// (객체이자 변수)
	public Tire frontLeftTire;
	public Tire frontRightTire;
	public Tire rearLeftTire;		//public 생략 가능 (default)
	public Tire rearRightTire;

	// 2. 생성자
	public Car(Tire frontLeftTire, Tire frontRightTire,
	Tire rearLeftTire, Tire rearRightTire) {
		// Tire frontLeftTire = new KTire();
		this.frontLeftTire = frontLeftTire;
		this.frontRightTire = frontRightTire;
		this.rearLeftTire = rearLeftTire;
		this.rearRightTire = rearRightTire;
	}

	// 3. 메서드
	public void run() {
		System.out.print("front-Left : ");
		frontLeftTire.roll();

		System.out.print("front-Right : ");
		frontRightTire.roll();

		System.out.print("rear-Left : ");
		rearLeftTire.roll();

		System.out.print("rear-Right : ");
		rearRightTire.roll();
	}
}
