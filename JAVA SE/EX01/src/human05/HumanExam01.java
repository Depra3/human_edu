package human05;

import java.util.Scanner;

public class HumanExam01 {

	public static void main(String[] args) {
		//입력을 a = 5;
		//5단을 출력하는 프로그램 만들어보기.
		
		//int a = 5;	
		
		int a;
		System.out.print("몇 단을 출력할까요 : ");
		Scanner sc = new Scanner(System.in);	//Scanner 객체 생성(사용자 입력 시작)
		a = sc.nextInt();
//		sc.nextLine();
		sc.close();		//Scanner 객체 소멸
		//변수 c 만들어서 복잡하게 곱셈 할 필요 없음. 
		for (int b = 1; b < 10; b++) { //b=b+1; or b += 1; // b <= 9
			System.out.printf("%d * %d = %d \n", a, b, a*b);		
		}
	}
}
