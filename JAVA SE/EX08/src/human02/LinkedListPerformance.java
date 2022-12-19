package human02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPerformance {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		list1.clear();
		list2.clear();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
			// String.valueOf(i)는 i라는 숫자를 문자로 변환.
			// 0의 위치에 추가하는 것은 데이터 삭제/추가가 빈번하게 발생하는 것을 실험한 것.
		}
		endTime = System.nanoTime();
		long diff1 = endTime - startTime;	// diff1은 ArrayList 수행 시간.
		System.out.println("ArrayList 수행시간	 : " + diff1);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
			// String.valueOf(i)는 i라는 숫자를 문자로 변환.
			// 0의 위치에 추가하는 것은 데이터 삭제/추가가 빈번하게 발생하는 것을 실험한 것.
		}
		endTime = System.nanoTime();
		long diff2 = endTime - startTime;	// diff2은 LinkedList 수행 시간.
		System.out.println("LinkedList 수행시간 : " + diff2);
	}

}
