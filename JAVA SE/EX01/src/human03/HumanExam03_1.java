package human03;

public class HumanExam03_1 {

	public static void main(String[] args) {
		// 예제) 점수가 90이상이면 A, 80이상이면 B, 그 외는 C학점
		// if ~ else..
		
		int score = 95;
		System.out.printf("score = %d \n", score);
		char grade = 'Z';
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
		}
		if (score >= 80 && score < 90) {
			grade = 'B';			
		}
		if (score >= 70 && score < 80) {
			grade = 'C';
		}
		if (score < 70) {
			grade = 'F';
			
		}
		
		System.out.printf("grade = %c \n", grade);

	}

}
