package human13;

public abstract class Car {
	public int currentSpeed;
	
	public Car(int speed) {
		this.currentSpeed = speed;
	}
	public void drive() {
		System.out.println("차가 달립니다.");
	}
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	public abstract void speedUp();
	public abstract int getCharge();

}
