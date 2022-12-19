package human01;

public class Car {
	//필드 (객체 표현) // 멤버변수
	public String company; 		// 제조사.
	public String model; 		// 차의 모델
	public int maxSpeed; 		// 차의 최고 속도
	public int currentSpeed; 	// 차의 현재속도
	public String color;		// 색깔
	
	public Car() {
		//생략가능. 만들어놓지 않아도 기본은 존재.
	}	

	//메서드 (객체 동작)
	public void speedUp() {
		currentSpeed = currentSpeed + 5;
	}
	public void speedDown() {
		currentSpeed = 0;
	}
}
