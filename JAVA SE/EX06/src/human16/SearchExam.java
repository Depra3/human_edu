package human16;

import java.util.Arrays;

public class SearchExam {

	public static void main(String[] args) {
		int index = 99;
		int[] scores = { 101, 97, 99 };
		index = Arrays.binarySearch(scores,101);
		System.out.println(index);	// 결과가 음수인 경우 찾지 못했다는 것.
		// binarySearch라는 기능은 배열안에서 내가 정의한 수치가 몇번째 수치인가?
		// 그래서 binarySearch를 사용하기 위해서는 우선적으로 정렬이 필요함.
		// 정렬하지 않으면 0자리에 있는 것을 찾지 못함. 
		
		Arrays.sort(scores);
		index = Arrays.binarySearch(scores, 97);
		System.out.println(index);
		// 2가 도출됨. (정렬 후 97, 98, 99로 변환되고. 99는 3번째이므로)
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println(index);
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("김민수");
		Member m3 = new Member("박동수");

		Member[] members = { m1, m2, m3 };
		Arrays.sort(members); // compareTo라는 정렬 기준에 의해 정렬.
		index = Arrays.binarySearch(members, m2);
		System.out.println(index);
	}

}
