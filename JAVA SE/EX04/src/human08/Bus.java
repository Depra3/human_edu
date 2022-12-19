package human08;

public class Bus implements Car {

	@Override
	public void run() {
		System.out.println("버스를 타고 출근합니다.");
	}
	public void checkFare() {
		System.out.println("버스 승차요금을 비교합니다.");
	}

}
