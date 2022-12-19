package human05;

public class ProductExam {

	public static void main(String[] args) {
		Tv t1 = new Tv("삼성", "Galaxy Tv", 300, true);
		Tv t2 = new Tv("LG", "G6 Tv", 200, false);
		
		Car c1 = new Car("현대", "G70", 300);
		Car c2 = new Car("기아", "K7", 250);
		
		Product<Tv> prod1 = new Product<Tv>();	// Tv는 클래스명
		prod1.setT(t1);
		prod1.setModel("Smart TV");
		
		Product<Tv> prod2 = new Product<Tv>();
		prod2.setT(t2);
		prod2.setModel("OLED TV");
		
		Product<Car> prod3 = new Product<Car>();
		prod3.setT(c1);
		prod3.setModel("세단");
		
		Tv z1 = prod1.getT();
		System.out.println("z1.company ==> " + z1.company);
		System.out.println("z1.name ==> " + z1.name);
		System.out.println("z1.maxChannel ==> " + z1.maxChannel);
		System.out.println("z1.isVoiceRecog ==> " + z1.isVoiceRecog);
		System.out.println("prod1.model ==> " + prod1.model);
		System.out.println("----------------------------------");
		Car z3 = prod3.getT();
		System.out.println("z3.company ==> " + z3.company);
		System.out.println("z3.name ==> " + z3.name);
		System.out.println("z3.maxSpeed ==> " + z3.maxSpeed);
		System.out.println("prod3.model ==> " + prod3.model);
		
	}

}
