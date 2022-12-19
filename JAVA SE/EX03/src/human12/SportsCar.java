package human12;

public class SportsCar extends Car{
	public SportsCar(int speed) {
		super(speed);
	}
	public void showInfo() {
		System.out.printf("SportsCar의 현재 속도 : %d \n", this.currentSpeed);
	}

}
