package human17;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟습니다.");
		
	}

	public void washCar() {
		System.out.println("손세차합니다.");
	}
}
