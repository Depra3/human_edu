package human15;

import java.util.Arrays;

public class ArrayCopyExam {
	public static void main(String[] args) {
		// 배열을 Copy하는 방법은 아래의 것 중 어느 것을 사용해도 무방함.

		char[] arr1 = { 'J', 'A', 'V', 'A' };
		// arr[0] = 'J'
		// arr[1] = 'A'
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		// arr1의 배열을 arr1.length의 길이만큼 Copy

		System.out.println(Arrays.toString(arr2));

		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr3));

		char[] arr4 = new char[arr1.length]; // arr4의 배열 크기를 지정.
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// arr1배열을 0에서부터 카피하는데 arr4에 넣을 때는 0의 위치에서 부터 arr1.length = 4 의 위치까지 차례대로 넣음.
		System.out.println(Arrays.toString(arr4));

		for (int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d] : %c \n", i, arr4[i]);
		}
		arr4[2] = 'Z';
		System.out.println(Arrays.toString(arr4));
	}
}
