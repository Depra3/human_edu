package human04;

public class Car {
	// 1. 멤버변수
	// (객체이자 변수)
	public Tire frontLeftTire = new KTire();
	public Tire frontRightTire = new KTire();
	Tire rearLeftTire = new KTire();
	Tire rearRightTire = new KTire();
	// 2. 생성자
//	public Car() {}
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
