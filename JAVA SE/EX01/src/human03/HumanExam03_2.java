package human03;

public class HumanExam03_2 {

	public static void main(String[] args) {
		int score = 55;
		char grade = 'Z';
		
		System.out.printf("score = %d \n", score);
		
		if (score >= 90) {
			grade = 'A';			
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 grade는 %c입니다.", grade);

	}

}
