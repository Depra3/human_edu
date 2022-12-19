package human07;

public class CarExam {

	public static void main(String[] args) {
		int money = 0;
		Bus bus1 = null;		//전역변수. null초기화 필요
		
		Car car1 = new Bus(); // 자동타입변환
		money = car1.getCharge(); // money = 1450;
		Car car2 = new Taxi();
		money = car2.getCharge(); // money = 8000;

		System.out.println(car1 instanceof Bus); // ture 	// car1이 Bus의 기반으로 만들어졌는가?
		System.out.println(car2 instanceof Bus); // false	// 상속 확인
//		Bus bus2 = (Bus) car2;
//		bus2.busRun();
		if (car1 instanceof Bus) {		// 변환전에 상속 확인(체크로직)
			bus1 = (Bus) car1;			// 강제적타입변환
			bus1.busRun();
			
		} else {
			System.out.println("변환 할 수 없습니다.");
		}

		if (car2 instanceof Taxi) { 	
			Taxi taxi1 = (Taxi) car2;
			taxi1.taxiRun();
		} else {
			System.out.println("변환 할 수 없습니다.");
		}

		if (car2 instanceof Bus) {
			Bus bus2 = (Bus) car2;
			bus2.busRun();
		} else {
			System.out.println("변환 할 수 없습니다.");
		}
		System.out.printf("요금 : %d\n", bus1.money);
		

	}

}
