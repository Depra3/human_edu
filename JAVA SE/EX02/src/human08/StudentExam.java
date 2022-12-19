package human08;

//import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {

		Student st1 = new Student("강현준", 1, 10, 80, 90, 70);

		int tot = st1.getTotal();
		double avg = st1.getAVG();

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("학생 이름 : ");
//		st1.name = sc.nextLine();
//		System.out.print("반 : ");
//		st1.ban = sc.nextInt();
//		System.out.print("번호 : ");
//		st1.no = sc.nextInt();
//		System.out.print("국어점수 : ");
//		st1.kor = sc.nextInt();
//		System.out.print("영어점수 : ");
//		st1.eng = sc.nextInt();
//		System.out.print("수학점수 : ");
//		st1.math = sc.nextInt();

//		System.out.println("----------------");
		System.out.printf("이름 : %s \n", st1.name);
		System.out.printf("총점 : %d \n", tot);
		System.out.printf("평균 : %4.2f\n", avg);
		System.out.println("----------------");

		Student st2 = new Student("강우혁", 2, 11, 100, 90, 90);

		tot = st2.getTotal();
		avg = st2.getAVG();
		System.out.printf("이름 : %s \n", st2.name);
		System.out.printf("총점 : %d \n", tot);
		System.out.printf("평균 : %4.2f\n", avg);
		System.out.println("----------------");

		Student st3 = new Student("강주혁", 2, 12, 80, 80, 80);

		tot = st3.getTotal();
		avg = st3.getAVG();
		System.out.printf("이름 : %s \n", st3.name);
		System.out.printf("총점 : %d \n", tot);
		System.out.printf("평균 : %4.2f\n", avg);

//		sc.close();

	}

}
