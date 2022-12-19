package human14;

public class Circle extends Shape {
	double area;

	private double r;
	private static final double PI = 3.141592;

	public Circle(double r) {
//		super(r);
		this.r = r;
	}

	@Override
	public double calcArea() {
//		area = r * r * Math.PI;
		area = r * r * PI;
		return area;
	}

}
