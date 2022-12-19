package human03_1;

public class Exam {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC; 
		// SUPERSONIC 변수는 static이므로 객체가 아닌 
		// 클래스 기반으로 접근 가능. 
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
