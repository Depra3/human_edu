package human03;

public class CarExam01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1 ==> " + car1);
		System.out.println("car1.company ==> " + car1.company);
		System.out.println("car1.model ==> " + car1.model);
		System.out.println("car1.maxSpeed ==> " + car1.maxSpeed);
		System.out.println("car1.currentSpeed ==> " + car1.currentSpeed);
		
		
		Car car2 = new Car();
		System.out.println("car2 ==> " + car2);
		System.out.println("car2.company ==> " + car2.company);
		System.out.println("car2.model ==> " + car2.model);
		System.out.println("car2.maxSpeed ==> " + car2.maxSpeed);
		System.out.println("car2.currentSpeed ==> " + car2.currentSpeed);

		Car car3 = new Car("현대자동차","그랜져", 250);
		System.out.println("car3 ==> " + car3);
		System.out.println("car3.company ==> " + car3.company);
		System.out.println("car3.model ==> " + car3.model);
		System.out.println("car3.maxSpeed ==> " + car3.maxSpeed);
		System.out.println("car3.currentSpeed ==> " + car3.currentSpeed);
	}

}
