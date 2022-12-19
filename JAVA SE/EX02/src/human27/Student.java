package human27;

public class Student {
	String studentId;
	String StudentName;
	String StudentMajor;

	// 학번,학생명,전공 과 5개의 과목이 연걸되어있지 않음.
	// 후일 연결 할때 5개의 과목쪽에 학번을 이용해 연결하는 방법 K01 - 1 - 2 - 3 - 4 - 5 배열 6칸  데이터베이스 참조 관련
	// 수강 과목과 점수를 배열로 선언했었음.
	// 새로운 클래스를 통해서 만들 예정.
	Subject[] sub = new Subject[5];

	// 5개의 과목방을 만들어서 과목명과 점수를 관리할 수 있게끔 처리.
	public Student(String stuentId, String studentName, String studentMajor, String[] courseName) {
		
		this.studentId = stuentId;
		this.StudentName = studentName;
		this.StudentMajor = studentMajor;
		
		for (int a = 0; a < 5; a++) {
			sub[a] = new Subject(courseName[a]);
		}
	}

	public void setCourseScore(String courName, int courseScore) {
		for (int a = 0; a < sub.length; a++) { //sub.length == 5
			if (courName.equals(sub[a].subjectName)) {	// 문자열 비교./ ==는 사용불가
				sub[a].subjectScore = courseScore;
				break;
			}
		}
	}
	public void showInfo() {
		System.out.printf("%s 님의 점수 \n",this.StudentName);
		for (int a = 0; a < 5; a++) {
			System.out.printf("%s : %d \n", sub[a].subjectName, sub[a].subjectScore);
		}
	}
}
