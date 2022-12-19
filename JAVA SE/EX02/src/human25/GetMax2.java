package human25;

public class GetMax2 {
	// 참조 자료형 변수 기반 설명 2
	public static void main(String[] args) {
		int[] array1 = { 5, 4, 9, 10, 3, 7 };
		int max = getMax(array1);
		System.out.printf("Max = %d \n", max);
		
		int[] array2 = { 1, 4, 9, 19, 3, 7 };
		max = getMax(array2);
		System.out.printf("Max = %d \n", max);
	}

	private static int getMax(int[] array) {
		// int[] array = array1;
		// int[] array = array2;
		int max = -99;

		for (int a = 0; a < array.length; a++) {
			if (max < array[a]) {
				max = array[a];
			}
		}
		return max;
	}

}
