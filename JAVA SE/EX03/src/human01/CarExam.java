package human01;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car(100);
		
		System.out.printf("car1의 현재속도 : %d\n",car1.currentSpeed);
		car1.speedUp();
		System.out.printf("car1의 현재속도 : %d\n",car1.currentSpeed);
		
		SportsCar sCar1 = new SportsCar(150);

		System.out.printf("sCar1의 현재속도 : %d\n",sCar1.currentSpeed);
		
		sCar1.speedUp();
		System.out.printf("sCar1의 현재속도 : %d\n",sCar1.currentSpeed);
		sCar1.turboSpeedUp();
		System.out.printf("sCar1의 현재속도 : %d\n",sCar1.currentSpeed);
	}
	

}
