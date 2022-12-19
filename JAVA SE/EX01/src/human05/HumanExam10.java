package human05;

import java.util.Scanner;

public class HumanExam10 {

	public static void main(String[] args) {
		boolean run = true;		// 반복 조건. 만약 사용자가 4를 선택하면 종료함.
		int balance = 0;		// 현재 내가 가지고 있는 잔고

		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("예금액 > ");
				int x = scanner.nextInt();
				balance = balance + x;
				System.out.println();
				break;
			case 2:
				System.out.print("출금액 > ");
//				b = scanner.nextInt();
//				balance = balance - x; 
				balance = balance - scanner.nextInt();
				System.out.println();	//임의
				break;
			case 3:
				System.out.println("잔고 > " +balance);
//				System.out.printf("잔고 > %d \n" ,balance);
				System.out.println();	//
				break;
			case 4:
				run = false;
				System.out.println("\n프로그램을 종료합니다");
				break;
			}
			
		}
		scanner.close();
	}

}
