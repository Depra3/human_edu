package human05;

import java.util.Scanner;

public class HumanExam02 {

	public static void main(String[] args) {
		int a;
		System.out.print("몇 단을 출력할까요 : ");
		Scanner sc = new Scanner(System.in);	//Scanner 객체 생성(사용자 입력 시작)
		a = sc.nextInt();
//		sc.nextLine(); human02 - Exam06
		
		sc.close();		//Scanner 객체 소멸
		
//		for (int b = 1; b < 10; b++) { //b=b+1; or b += 1;
//			System.out.printf("%d * %d = %d \n", a, b, a*b);		
//		}
		int b = 1;
		while (b < 10) { // b <= 9
			System.out.printf("%d * %d = %d \n", a, b, a*b);
			b++;
		}
	}
}
