package human07;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExam {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;

		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		// null과 null도 같음
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println("------------------------");
		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Objects.equals(arr1, arr2));
		// 주소가 다르기 때문에 false
		System.out.println(Objects.deepEquals(arr1, arr2));
		// deepEquals라는 메서드는 객체 내부의 값이 같은지 비교하는 것임.
		System.out.println(Arrays.deepEquals(arr1, arr2));
		// Objects.deepEquals와 Arrays.deepEquals의 배열비교는 같은 내용
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
		
	}
}