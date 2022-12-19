package human02;

import java.util.Scanner;

public class HumanExam07 {

	public static void main(String[] args) {
		int score = 90;
//		Scanner sc = new Scanner(System.in);
//		score = sc.nextInt();
//		char grade = (score > 90) ? 'A' : 'B';
//		sc.nextLine();		
//		System.out.printf("score = %d , grade = %c \n", score, grade);
		
		char grade = (score > 90) ? 'A' : 'B';
		
		System.out.printf("score = %d, grade = %c \n", score, grade);

	}

}
