package human14;

public class ShapeExam {

	public static void main(String[] args) {

		Shape c1 = new Circle(5.0);
		System.out.printf("원의 넙이는 %f입니다.\n", c1.calcArea());
		Shape r1 = new RectAngle(3, 4);
		System.out.printf("사각형의 넓이는 %f입니다. \n", r1.calcArea());
		Shape t1 = new TriAngle(7, 5);
		System.out.printf("삼각형의 넓이는 %f입니다. \n", t1.calcArea());
		
		Circle c2 = new Circle(4.0);
		System.out.printf("원의 넙이는 %f입니다.\n", c2.calcArea());
		RectAngle r2 = new RectAngle(5, 4);
		System.out.printf("사각형의 넓이는 %f입니다. \n", r2.calcArea());
		TriAngle t2 = new TriAngle(9, 5);
		System.out.printf("삼각형의 넓이는 %f입니다. \n", t2.calcArea());

	}

}
