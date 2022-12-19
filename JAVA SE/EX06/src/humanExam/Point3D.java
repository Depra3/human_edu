package humanExam;

public class Point3D extends Point {
	public int x, y, z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp() {
		this.z++;
	}

	public void moveDown() {
		this.z--;
	}

	protected void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}

	public String toString() {
		return ("(" + super.getX() + ", " + this.getY() + ", " + this.z + ")의 점");
	}
}
