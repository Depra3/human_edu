package human08;

public class VehicleExam {

	public static void main(String[] args) {
		Car car = new Bus();
		// car라는 객체는 Bus에서 구체화된 run만 실행 가능
		// checkFare()는 강제타입변환 후 실행 가능.
		car.run();
//		car.checkFare();
//		if (car instanceof Bus) { 체크로직
//				
//		}
		Bus b1 = (Bus) car;	// 강제타입변환
		b1.run();
		b1.checkFare();
		
		// car는 Bus를 통해서 구현된 객체이므로
		// Taxi 클래스로 강제타입변환 불가함.
		// ClassCastException이 발생함
		// 코드상 오류는 없으나 강제타입변환이 안되어 오류 발생
//		Taxi t1 = (Taxi) car;
//		t1.run();
//		t1.checkFare();
		
		boolean isBus = (car instanceof Bus);
		System.out.println(isBus);
		// true가 나올것임.
		// 강제타입변환은 꼭 instanceof를 통해서 점검 필요.
		if (car instanceof Bus) {
			Bus b2 = (Bus) car;
			b2.run();
			b2.checkFare();
		} else {
			System.out.println("강제타입변환 할 수 없습니다.");
		}
		
	}

}
