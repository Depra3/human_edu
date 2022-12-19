package human14;

public class RectAngle extends Shape{
	double area;
	
//	private double width;
//	private double height;
	private int width;
	private int height;

//	public RectAngle(double width, double height) {	// int
//		super(width, height);
//	}
	
	public RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		area = this.width * this.height;
		return area;
	}

}
