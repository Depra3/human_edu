package human06;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println("----------------------");
		car.tires[0] = new HTire();
		car.run();
	}
}
