package human17;

public class CarExam {

	public static void main(String[] args) {
		Car mCar = new ManualCar();
		mCar.run();
		
		System.out.println("-----------");

		Car aiCar = new AICar();
		aiCar.run();
	}

}
