package human01;

public class CarExam01 {
							//객체 지향 프로그램
	public static void main(String[] args) {
		Car car1 = new Car();	//객체 생성 또는 인스턴스 생성 car1,car2
		car1.company = "현대 자동차";
		car1.model = "그랜져";
		car1.maxSpeed = 250;
		car1.currentSpeed = 80;
		
		Car car2 = new Car();
		car2.company = "기아 자동차";
		car2.model = "K3";
		car2.maxSpeed = 270;
		car2.currentSpeed = 100;
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car1.company);
		System.out.println(car2.company);
		System.out.println(car1.maxSpeed);
		System.out.println(car2.maxSpeed);
		System.out.println(car1.currentSpeed);
		System.out.println(car2.currentSpeed);
		System.out.println("----------------");
		car1.speedUp();
		System.out.println(car1.currentSpeed);
		System.out.println(car2.currentSpeed);
		System.out.println("----------------");
		car2.speedUp();
		System.out.println(car1.currentSpeed);
		System.out.println(car2.currentSpeed);
	}

}
