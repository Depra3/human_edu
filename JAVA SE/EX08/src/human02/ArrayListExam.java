package human02;

import java.util.ArrayList; // 구현 클래스
import java.util.Arrays;
import java.util.List; 		// 인터페이스

public class ArrayListExam {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		// 초기 용량이 10으로 설정된 default 리스트.
		List<String> list2 = new ArrayList<String>(100);
		// 초기 용량이 100으로 설정된 리스트
		List<String> list3 = Arrays.asList("a", "b", "c", "d");
		// list3은 초기값이 정의된 List 컬렉션.
		// Arrays.asList는 수정이 불가함. 고정적으로 사용할 때만 사용 가능. 
		// ==> 추가 / 삭제 / 변경 불가. 검색만 가능.
		
		String str1 = list3.get(0);
		String str2 = list3.get(2);
		// get 메서드는 list안에 있는 데이터를 검색.
		// E				get(int index)
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(list3);
		System.out.println("----------------------");
		
		list1.add("KANG");
		list1.add("HUMAN");
		list1.add("a"); list1.add("b");list1.add("a"); list1.add("b");
		list1.add("a"); list1.add("b");list1.add("a"); list1.add("b");
		list1.add("a"); list1.add("b");
		// list 컬렉션은 초기 용량보다 더 많은 add가 되면 스스로 증량하게 해주는 기능이 있음.
		System.out.println(list1);
		list1.clear();		// 리스트 안의 데이터를 모두 삭제함.
		System.out.println(list1);
		
		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		boolean a1 = list1.add("휴먼");
		System.out.println("----------------------");
		System.out.println(list1);
		System.out.println("a1 : " + a1);
		list1.add(1, "영등포");	// add에 인덱스를 추가할 경우 인덱스 위치에 내용을 추가하고, 뒤의 내용을 한 칸씩 미룬다.
		System.out.println(list1);
		String isSet = list1.set(1, "천안");
		// set은 특정 위치에 데이터를 변경함. 되돌려준 값은 변경 이전의 값을 되돌려줌.
		System.out.println(list1);
		System.out.println("isSet : "+ isSet);	// isSet : 영등포.
		
		boolean isE1 = list1.isEmpty();
		// list1이 비어있으면 true, 비어있지 않으면 false;
		System.out.println("list1.isEmpty() ==> " + isE1);
		boolean isE2 = list2.isEmpty();
		System.out.println("list2.isEmpty() ==> " + isE2);
		int list1Length = list1.size();
		System.out.println("list1.length ==> " + list1Length);
		
		String str = list1.get(0);
		System.out.println("list1.get(0) : " + str);
		
		String remove4 = list1.remove(4);	
		// list의 인덱스 위치에서 객체를 삭제함. 되돌려주는 값은 지워진 값. 지워진 값 확인 할때 리턴값 받는 것 이용
		System.out.println(list1);
		System.out.println("remove4 : " + remove4);
		boolean isRemove1 = list1.remove("천안");
		System.out.println(list1);
		System.out.println("isRemove1 : " + isRemove1);
		
		
	}
}
