package human06;

public class Car {
	public int money;

	public Car() {
		System.out.println("CAR 객체 생성");
	}

	public int getCharge() {
		int charge = 1600;
		// 평균적인 대중교통 요금 1600원
		System.out.printf("일반적인 요금 : %d \n", charge);
		return charge;
	}
}
