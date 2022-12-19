package human27;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		//String stuentId, String studentName,String studentMajor, String[] courseName
		String [] courseName = {"경제", "물류","수학","컴퓨터","영어"};
		Student s1 = new Student("K01", "강현준", "산업공", courseName);
		s1.setCourseScore("경제", 80);
		s1.setCourseScore("물류", 81);
		s1.setCourseScore("수학", 82);
		s1.setCourseScore("컴퓨터", 83);
		s1.setCourseScore("영어", 84);
		s1.showInfo();
		System.out.println("----------------------");
		
		String [] courseName2 = {"컴퓨터", "수학","영어","네트웍","그래픽"};
		Student s2 = new Student("K02", "김석훈", "컴퓨터공", courseName2);
		s2.setCourseScore("그래픽", 90);
		s2.setCourseScore("네트웍", 91);
		s2.setCourseScore("영어", 92);
		s2.setCourseScore("수학", 93);
		s2.setCourseScore("컴퓨터", 94);
		s2.showInfo();
		System.out.println("----------------------");

		String s3Name;
		String s3Major;
		String[] courseName3 = new String[5];
		int s3sbScore;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 : ");
		s3Name = sc.nextLine();
		System.out.print("전공 과목 : ");
		s3Major = sc.nextLine();
		
		for (int i = 0; i < courseName3.length; i++) {
			System.out.printf("%d번째 과목을 입력 : ",i+1);
			courseName3[i] = sc.nextLine();			
		}
		System.out.println("- - - - - - - - - - - - - -");
		
		Student s3 = new Student("K03",s3Name, s3Major, courseName3);
		
		for (int i = 0; i < courseName3.length; i++) {
			
			System.out.printf("%s 과목의 점수 : ", courseName3[i]);
			s3sbScore = sc.nextInt();
			
			s3.setCourseScore(courseName3[i], s3sbScore);
		}
		System.out.println("- - - - - - - - - - - - - -");
		s3.showInfo();
		sc.close();

	}

}
