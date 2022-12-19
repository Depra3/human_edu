package human26;

public class Student {
	String StudentId;		// 학번
	String StudentName;		// 학생이름
	String StudentMajor;	// 전공

	String[] courseName;	// 수강신청 과목명
	int[] courseScore;		// 수강신청 점수 == 처음에는 0이었다가, 점수 확정 후 업데이트

	public Student(String StudentId, String StudentName, 
			String StudentMajor, String[] courseName) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.StudentMajor = StudentMajor;
		this.courseName = courseName;
	}
	public void setCourseScore(int[] courseScore) {
		this.courseScore = courseScore;
	}
	public void showInfo() {
		int sum = 0;
		System.out.printf("%s 학생의 점수 \n", this.StudentName);
		for (int a = 0; a < 5; a++) {
			System.out.printf("%s : %d \n", courseName[a], courseScore[a]);
			sum = sum + this.courseScore[a];
		}
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %2.2f \n", (sum/5.0));
	}
}
