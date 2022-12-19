package humanExam;

public class ColoPoint extends Point {

	private String color;

	public ColoPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public String toString() {
		return (this.color + "색의 (" + super.getX() + ", " + this.getY() + ")의 점");
	}
}
