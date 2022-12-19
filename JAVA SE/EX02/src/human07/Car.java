package human07;

public class Car {
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;

	public Car(String company, String model, 
			int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	
	//메서드 오버로딩
	public void speedUp() {
		// 속도가 1 증가하는 기능.
//		currentSpeed++;
//		
		//car1이 들어와 있는 상황에서는 this ==> car1을 의미
		
		if (this.currentSpeed < this.maxSpeed) {
			this.currentSpeed = this.currentSpeed + 1;
		} else {
			System.out.println("최고속도 이상 올리지 못합니다.");
		}
	}
	public void speedUp(int speed) {	// 제약사항/기준 정하기 - 최고속도
		if (this.currentSpeed < this.maxSpeed) {
			this.currentSpeed = this.currentSpeed +speed;
		}else {
			this.currentSpeed = this.maxSpeed;
		}
	}
	
	public int speedDown() { //int
		// 속도가 1 감소하는 기능
//		currentSpeed--;
		this.currentSpeed--; 
		//this.currentSpeed = this.currentSpeed - 1;
		return this.currentSpeed;
	}
	public int speedDown(int speed) {
		this.currentSpeed -= speed;
//		this.currentSpeed = this.currentSpeed - speed;
		return this.currentSpeed;
	}
	
}