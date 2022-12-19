package human12;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(10, 10, 5);
		s1.printInfo();
		s1.age();
		s1.printInfo();
		s1.coding();
		s1.talk();
		s1.attack();
		s1.move(5, 10);
		s1.printInfo();
		s1.swimDown(10);
		s1.swimDown(80);
		s1.printInfo();
		System.out.println("------------------------");
		Student s2 = new Student(20, 20, 10);
		s2.printInfo();
		s2.age();
		s2.printInfo();
		s2.coding();
		s2.talk();
		s2.attack();
		s2.move(5, 10);
		s2.printInfo();
		s2.swimDown(10);
		s2.printInfo();
		System.out.println("------------------------");
		Pigeon p1 = new Pigeon(1, 1, 1);
		p1.printInfo();
		p1.attack();
		p1.fly();
		p1.flyMove(10, 20);
		p1.printInfo();
		System.out.println("------------------------");
		Turtle t1 = new Turtle(2, 2, 2);
		t1.printInfo();
		t1.swimDown(10);
		t1.printInfo();
	}
}