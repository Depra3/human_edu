package human13;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.speedUp();
		car1.speedUp();

		Car.driving();
		car1.driving();
		// static 메서드인 driving은 객체 기반으로도 접근 가능.
		// 권장하지는 않는다.
		int sp;
		
		sp = Car.maxSpeed;
		sp = car1.maxSpeed;
		// static 변수인 maxSpeed는 클래스를 통해서 접근하는 것을
		// 권장하나, 객체를 통해서 접근하는 것도 가능하다.
		
	}

}
