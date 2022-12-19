package human05;

public class HumanExam08 {

	public static void main(String[] args) {
		// x, y는 1~10 사이의 정수
		// 4x + 5y == 60인 정수 x,y의 값을 출력.
		
		int x, y;

		for (x = 0; x <= 10; x++) {
			for (y = 0; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}

	}

}
