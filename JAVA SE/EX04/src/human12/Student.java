package human12;

public class Student extends Human implements Programable, Swimable {

	public Student(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void printInfo() {
		System.out.printf("Student - > X(%d), Y(%d), age(%d)\n", this.getX(), this.getY(), this.getAge());
	}

	@Override
	public void swimDown(int y) {
		this.setY(this.getY() - y);
		// 현재 나의 Y위치에서 y만큼 밑으로 내려감
		if (this.getY() < -50) {
			System.out.println("위험하니 조심하십시오.");
		}
	}

	@Override
	public void coding() {
		System.out.println("학생은 코딩할 수 있습니다.");
	}

}
