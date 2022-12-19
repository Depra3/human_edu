package human15;

import java.util.Arrays;

public class EqualsExam {

	public static void main(String[] args) {
		int[][] origin = { { 1, 2 }, { 3, 4 } };
		System.out.println("얕은 복제 후 비교");
		int[][] cloned1 = Arrays.copyOf(origin, origin.length);
		System.out.println("origin : " + origin);
		System.out.println("cloned1 : " + cloned1);			// 서로 다름
		System.out.println("origin[0] : " + origin[0]);
		System.out.println("cloned1[0] : " + cloned1[0]);	// 서로 같음. { 1, 2 }
		System.out.println("배열 번지 비교 : " + origin.equals(cloned1));

		System.out.println("1차 배열 항목값을 비교 : "+ Arrays.equals(origin, cloned1));
		// origin[0] == cloned1[0] 주소값비교?
		System.out.println("1차 배열 항목값을 비교 : "+ Arrays.deepEquals(origin, cloned1));
		// 배열 안에 있는 데이터를 비교하는 기능.
	}

}
