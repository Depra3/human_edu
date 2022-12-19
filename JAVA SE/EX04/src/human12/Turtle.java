package human12;

public class Turtle extends Animal implements Swimable{

	public Turtle(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void printInfo() {
		System.out.printf("Turtle - > X(%d), Y(%d), age(%d)\n", this.getX(), this.getY(), this.getAge());
	}

	@Override
	public void swimDown(int y) {
		this.setY(this.getY() - y);
	}
}
