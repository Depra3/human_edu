package human18.testA;

public class Student {
	public String name;
	public int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public void showInfo() {
		System.out.printf("%s 학생의 점수는 %d입니다. \n", this.name, this.score);
	}

}
