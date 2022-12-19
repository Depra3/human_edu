package humanExam;

public class Car {
	public int currentSpeed; // 현재속도
	public int maxSpeed; // 최고속도
	public String made; // 제조사
	public String model; // 모델

	public Car(int currentSpeed, int maxSpeed, String made, String model) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
		this.made = made;
		this.model = model;
	}

	public void run() {
		System.out.printf("%s차가 달립니다.\n", made);
	}

	public void speedUp() {
		currentSpeed++;
		if (currentSpeed > maxSpeed) {
			System.out.printf("%s차는 최고 속도입니다.\n", this.made);
			currentSpeed = maxSpeed;
		}
	}

	public void stop() {
		currentSpeed = 0;
	}
}
