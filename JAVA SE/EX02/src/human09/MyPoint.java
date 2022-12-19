package human09;

public class MyPoint {
	public int x;
	public int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x, int y) {
//		int a, b, c;
//		a = x - this.x;
//		b = y - this.y;
//		c = ((a * a) + (b * b));
//		return Math.sqrt(c);
		
		double dist;
		int a, b;
		a = this.x - x;
		b = this.y - y;
		
		dist = Math.sqrt(a * a + b * b);
		return dist;
	}

}
