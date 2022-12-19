package humanExam.exam1;

public class E2 {
	public static void main(String[] args) {
		int[] score = {90,80,70,60,50};
		int sum=0;
		int avg=0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / 5;
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %d\n", avg);
	}
}
