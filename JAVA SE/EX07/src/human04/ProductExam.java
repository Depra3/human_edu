package human04;

public class ProductExam {

	public static void main(String[] args) {
		Tv t1 = new Tv("삼성");
		Tv t2 = new Tv("LG");

		Product<Tv> prod1 = new Product<Tv>();
		prod1.setType(t1);
		prod1.setModel("Smart TV");

		Product<Tv> prod2 = new Product<Tv>();
		prod2.setType(t2);
		prod2.setModel("OLED TV");

		Car c1 = new Car("현대");
		Product<Car> prod3 = new Product<Car>();
		prod3.setType(c1);
		prod3.setModel("그랜져");

		Tv z1 = prod1.getType();
		System.out.printf("prod1의 제품의 회사(%s), 모델명(%s) \n", z1.company, prod1.getModel());

		Car z3 = prod3.getType();
		System.out.printf("prod3의 제품의 회사(%s), 모델명(%s) \n", z3.company, prod3.getModel());
	}

}
