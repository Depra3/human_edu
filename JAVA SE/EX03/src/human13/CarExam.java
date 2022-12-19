package human13;

public class CarExam {

	public static void main(String[] args) {
		Bus bus1 = new Bus(100);
		bus1.speedUp();
		System.out.printf("Bus의 속도 : %d\n", bus1.currentSpeed);
		int busMoney = bus1.getCharge();
		System.out.printf("Return Bus Money : %d \n", busMoney);
		System.out.println("---------------------------");

		Taxi tax1 = new Taxi(120);
		tax1.speedUp();
		System.out.printf("Taxi의 속도 : %d\n", tax1.currentSpeed);
		int taxMoney = tax1.getCharge();
		System.out.printf("Return Taxi Money : %d \n", taxMoney);
	}

}
