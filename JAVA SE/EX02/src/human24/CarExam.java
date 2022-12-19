package human24;

public class CarExam {

	public static void main(String[] args) {
		Car car1 =new Car(220, 250);
		System.out.printf("현재 속도 : %d / 최고속도 : %d \n", car1.getCurrentSpeed(),car1.getMaxSpeed());
		// getter를 통해서 데이터를 가져온다.
		
//		car1.maxSpeed = 249;
		car1.setMaxSpeed(249);
		System.out.printf("현재 속도 : %d / 최고속도 : %d \n", car1.getCurrentSpeed(),car1.getMaxSpeed());
		
		car1.speedUp(10);
		System.out.printf("현재 속도 : %d / 최고속도 : %d \n", car1.getCurrentSpeed(),car1.getMaxSpeed());
		car1.speedUp(50);
		System.out.printf("현재 속도 : %d / 최고속도 : %d \n", car1.getCurrentSpeed(),car1.getMaxSpeed());
	}

}
