package humanExam;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car(90, 200, "현대", "그랜져");
		Car car2 = new Car(200, 200, "기아", "K7");

		car1.run();
		car2.run();
		System.out.println("----------------------");

		car1.speedUp();
		System.out.printf("%s차의 현재속도 : %d\n", car1.made, car1.currentSpeed);
		car2.speedUp();
		System.out.printf("%s차의 현재속도 : %d\n", car2.made, car2.currentSpeed);
		System.out.println("----------------------");

		car1.stop();
		System.out.printf("%s차의 현재속도 : %d\n", car1.made, car1.currentSpeed);
		car2.stop();
		System.out.printf("%s차의 현재속도 : %d\n", car2.made, car2.currentSpeed);
	}

}
