package human25;

public class GetMax1 {
	// 참조 자료형 변수 기반 설명 1
	public static void main(String[] args) {
		int[] array1 = { 5, 4, 9, 10, 3, 7 };
		int max = -99;

		for (int a = 0; a < array1.length; a++) {
			if (max < array1[a]) {
				max = array1[a];
			}
		}
		System.out.printf("Max = %d \n", max);
		
		int[] array2 = { 1, 4, 9, 19, 3, 7 };
		max = -99;
		
		for (int a = 0; a < array2.length; a++) {
			if (max < array2[a]) {
				max = array2[a];
			}
		}
		System.out.printf("Max = %d \n", max);
	}
	
}
