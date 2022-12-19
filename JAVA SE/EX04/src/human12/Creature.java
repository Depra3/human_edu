package human12;

public abstract class Creature {
	private int x, y;
	private int age;

	public Creature(int x, int y, int age) {
		this.x = x;
		this.y = y;
		this.age = age;
	}

	public int getX() {
		return this.x; // this. 붙여주는게 좋음
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		// int y = this.getY() - y / swimDown
		this.y = y;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void age() {
		// 나이를 1살 먹다.
		this.age++;
	}

	public void move(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public abstract void attack();
	public abstract void printInfo();
}
