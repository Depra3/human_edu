package human14;

public class TriAngle extends Shape{
	private int width;
	private int height;
	
	public TriAngle(int width, int height) {
//		super(width, height);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width * height * 0.5;
	}
}
