package human16;

import java.util.Arrays;
import java.util.Collections;

public class SortExam {

	public static void main(String[] args) {

		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores); // 배열을 오름차순으로 정렬
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d\n", i, scores[i]);
		}
		System.out.println("-------------------");

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names); 
		// String도 오름차순으로 정렬
		Arrays.sort(names, Collections.reverseOrder());
		// 내림차순 정렬. Collections.reverseOrder()
		for (int i = 0; i < names.length; i++) {
			System.out.printf("names[%d] = %s\n", i, names[i]);
		}
		System.out.println("-------------------");

		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");

		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		//sort 메서드 내에는 ==> m1.compareTo(m2) 기능을 수행.
		for (int i = 0; i < members.length; i++) {
			System.out.printf("members[%d] = %s\n", i, members[i].name);
		}

	}

}
