package human23;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
//		car1.maxSpeed = 350;
		car1.setMaxSpeed(350);
//		car1.setMaxSpeed(250);
//		System.out.println(car1.getMaxSpeed());

		int maxSpeed = car1.getMaxSpeed();
		System.out.println(maxSpeed);
	}

}
