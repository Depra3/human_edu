package humanExam;

public class PositivePoint extends Point {
	public int x = 0;
	public int y = 0;

	public PositivePoint(int x, int y) {
		if (x < 0 || y < 0) {
//			System.out.println("객체 p는 음수 공간으로 이동되지 않음");
		} else {
			super.move(x, y);
		}
	}
	
	public PositivePoint() {
		super();
	}

	public String toString() {
		return ("(" + super.getX() + ", " + super.getY() + ")의 점");
	}

	@Override
	protected void move(int x, int y) {
		if (x < 0 || y < 0) {
//			System.out.println("객체 p는 음수 공간으로 이동되지 않음");
		} else {
			super.move(x, y);
		}

	}
}
