package human24;

public class Car {
	private int currentSpeed;
	private int maxSpeed;

	public Car(int currentSpeed, int maxSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return this.currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void speedUp(int speed) {
		// 속도를 올리는데 차가 가지고 있는 최고 제한 속도보다 클 경우는 최고제한속도까지만 속도를 올린다.
//		if (this.currentSpeed + speed <= this.maxSpeed) {
		if (this.maxSpeed >= this.currentSpeed + speed) {
			this.currentSpeed = this.currentSpeed + speed;			
		} else {
			this.currentSpeed = this.maxSpeed;
		}
		
	}

}
