package human06;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.getCharge();
		
		Car car2 = new Bus();	// 자동타입변환
		car2.getCharge();
		
		Car car3 = new Taxi();
		car3.getCharge();

	}

}
