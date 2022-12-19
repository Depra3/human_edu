package human05;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("------------");
//		Car car2 = new Bus();
		
		// car2는 현재까지는 Bus
		Car car2 = new Taxi();
		// car2는 지금은 Taxi

		// 다형성이란 것은 BUS였다가 TAXI로 바꿀 수 있는
		// 부모의 형태가 다양하게 변경되는 성질.
		car2.run();

		// car2.run()이란 소스는 변경없이도 
		// 다형성의 성질에 의해 다양하게 변한다.

		Taxi t1 = new Taxi();
	
	}

}
