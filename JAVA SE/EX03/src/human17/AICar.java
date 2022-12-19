package human17;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다.");
		System.out.println("스스로 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
		
	}
	public void washCar() {
		System.out.println("세차장으로 스스로 이동합니다.");
	}

}
