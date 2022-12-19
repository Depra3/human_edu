package human02;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		list1.add("Date1");
		System.out.println(list1);
		list1.add("Date2");
		System.out.println(list1);
		list1.add(0, "Date0");
		System.out.println(list1);
		
		// LinkedList를 사용하는 첫번째 이유 ==> linkedList만의 특정 메서드를 사용할 수 있다.
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("휴먼");
		linkedList.addFirst("영등포");	// = linkedList.add(0, "영등포") 와 같은 개념.
		System.out.println(linkedList);
		linkedList.addLast("센터");		// = linkedList.add(linkedList.size(), "센터") 와 같은 개념.
		System.out.println(linkedList);
		
	}
}
