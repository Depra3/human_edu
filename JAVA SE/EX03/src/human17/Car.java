package human17;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	public void endCar() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {	}
	public abstract void drive();
	public abstract void stop();
	
	public void run() {
		startCar();
		drive();
		stop();
		endCar();
		washCar();
	}
}
