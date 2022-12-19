package human12;

public class CarExam {

	public static void main(String[] args) {
//		Car car1 = new Car(100);
		// 추상 클래스는 객체 생성 불가.
		// 부모 클래스로만 존재함.

		SportsCar sCar = new SportsCar(100);
		sCar.drive();
		sCar.showInfo();
		sCar.stop();

	}

}
