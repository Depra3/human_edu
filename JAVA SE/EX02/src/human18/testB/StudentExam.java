package human18.testB;

import human18.testA.Student;
//import human18.testA.*; testA 아래의 모든클래스
//import : ctrl + shift + o //제한적인 부분 ctrl + space

public class StudentExam {

	public static void main(String[] args) {
		//다른 패키지의 클래스를 사용하는 방법
		//case1. 패키지명을 붙임 -human18.testA. 추가
		human18.testA.Student s1 = new human18.testA.Student("강현준",88);
		s1.showInfo();
		
		//case2. improt 사용
		Student s2 = new Student("강우혁",95);
		s2.showInfo();
	}
}
