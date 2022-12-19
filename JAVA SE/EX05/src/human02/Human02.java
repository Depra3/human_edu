package human02;

public class Human02 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException 사례
		int[] scores = { 10, 20, 30 };
		System.out.printf("Score[0] = %d\n", scores[0]);
		System.out.printf("Score[2] = %d\n", scores[2]);
		System.out.printf("Score[3] = %d\n", scores[3]); // ArrayIndexOutOfBoundsException

	}

}
