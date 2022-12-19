package human12;

public abstract class Car {
	// 추상 클래스는 자동차의 공통저긴 특징만을 뽑아서 정리한다.
	// 추상클래스는 부모로써만 존재하므로, 객체를 생성할 수 없다.
	public int currentSpeed;

	public Car(int speed) {
		this.currentSpeed = speed;
	}
	public void drive() {
		System.out.println("차가 달립니다.");
	}
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}


}
