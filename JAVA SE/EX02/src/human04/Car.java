package human04;

public class Car {
	public int speed;
//	==	public int speed = 0;
	public String color;
//	==	public String color = null;

	// 혼자있을땐 생략 가능, 다른 생성자가 존재하면 생략 안됨
	// Car() 생성자는 오버로딩된 생성자가 있을 경우 생략 불가함.
	public Car() {

	}

//	public Car(int speedTemp) {
//		speed = speedTemp; // 변수명이 달라서 this. 생략 가능
//								// 변수명이 같으면 this. 생략 불가
//	}
	public Car(int speed) {
		this.speed = speed;
		//다른 변수는 디폴트로 초기화 가능
		//this.color = "RED";
	}

	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}

}
