package human05;

public class Taxi extends Car {
	
	int b = 0;
	public Taxi() {
		System.out.println("TAXI 객체 생성");
	}
	public void run() {
		System.out.println("TAXI가 달립니다.");
	}
	public void stop() {
		System.out.println("Car가 멈춥니다1.");
	}

}
