package human04;

public class CarExam01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car(100);
		Car car3 = new Car(120, "RED");
		
		System.out.println("car1.speed ==> " + car1.speed);
		System.out.println("car2.speed ==> " + car2.speed);
		System.out.println("car3.speed ==> " + car3.speed);
		
		System.out.println("car1.color ==> " + car1.color);
		System.out.println("car2.color ==> " + car2.color);
		System.out.println("car3.color ==> " + car3.color);

	}

}
