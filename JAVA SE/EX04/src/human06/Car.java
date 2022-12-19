package human06;

public class Car {
	// int[] a = {10,20,30,40}
	// Tire t1 = new KTire();

	Tire[] tires = { new KTire(), new KTire(), new KTire(), new KTire() };
	// Tire[0] tires = new KTire();
	// Tire[1] tires = new KTire();

	public void run() {
		for (int i = 0; i < tires.length; i++) {
			System.out.printf("%d : ", i);
			tires[i].roll();
		}
	}
}
