package human02_2;

public class Vehicle {
	public int speed;

	public Vehicle() {
		this.speed = 0;
		System.out.println("Vehicle() 생성");
	}

	public Vehicle(int speed) {
		this.speed = speed;
		System.out.printf("Vehicle(%d) 생성 \n",speed);
	}
}
