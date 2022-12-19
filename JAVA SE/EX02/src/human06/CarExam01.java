package human06;

public class CarExam01 {

	public static void main(String[] args) {
		Car car1 = new Car("현대", "그랜져", 250,100);
		Car car2 = new Car("기아", "K7", 200, 50);

		System.out.println("car1의 현재속도 ==> " + car1.currentSpeed);
		System.out.println("car2의 현재속도 ==> " + car2.currentSpeed);
		
		car1.speedUp();
		
		System.out.println("car1의 현재속도 ==> " + car1.currentSpeed);
		System.out.println("car2의 현재속도 ==> " + car2.currentSpeed);
		
		int car1CurrentSpeed;
		car1CurrentSpeed = car1.getCurrentSpeed();
		System.out.println("car1의 현재속도 ==> " + car1CurrentSpeed); //car1.currentSpeed;
		System.out.println("car1의 현재속도 ==> " + car1.getCurrentSpeed());
		System.out.println("car2의 현재속도 ==> " + car2.getCurrentSpeed());

		int car2CurrentSpeed;
		car2CurrentSpeed = car2.speedDown();
		System.out.println("car2의 현재속도 ==> " + car2CurrentSpeed);
//		int to = at(car2.currentSpeed,car1.maxSpeed);
//		System.out.println(to);
	}

//	public static int at(int car_at, int car_hp){
//		int to=0;
//		to = car_hp - car_at;
//		return to;
//	}
}