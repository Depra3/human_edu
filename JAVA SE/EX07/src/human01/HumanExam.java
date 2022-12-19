package human01;

import java.util.ArrayList;
import java.util.List;

public class HumanExam {

	public static void main(String[] args) {
		// 1. 제네릭을 사용하지 않았을 경우의 케이스 ==> 데이터의 타입을 확인하면서 강제타입변환이 필요하였음.
		List list1 = new ArrayList();
		// List는 인터페이스, ArrayList는 구현클래
		list1.add("HUMAN1");
		list1.add("HUMAN2");
		list1.add(10);
		// 위의 형태대로 문자와 숫자가 같이 담겨있을 수 있는 이유는 
		// Object의 형태이기 떄문에 가능함.

		String str1 = (String) list1.get(0);
		// list1.get(0) ==> 되돌려주는 값의 타입 - Object
		// Object 클래스는 모든 클래스의 최상위 타입임.
		// String 클래스는 Object를 상속받은 Object 하위의 클래스임.
		// 즉, Object 타입을 ==> String 타입으로 변환하기 위해서는 강제타입변환이 필요함.
		
		System.out.println("str1 : " + str1);
		
		int intValue = (int) list1.get(2);
		System.out.println("intValue : " + intValue);
		
		// 2. 제네릭은 처음부터 담길 데이터의 타입을 제한하는 것을 의미함.
		List <String> list2 = new ArrayList<String>();
		// list2라는 배열변수에 String 타입만 우선 담기는 것을 제한함.
		list2.add("Human3");
//		list2.add(10);		
		// 제네릭을 사용하게 되면, 제약을 둔 데이터 타입이외의 것이 들어오면 미리 체크할 수 있는 장점.
		// 배열변수의 데이터 타입에 대해서 데이터 정합성을 사전에 체크할 수 있다.
		
		String str2 = list2.get(0);
		// 제네릭을 사용하면 배열변수에 담길 데이터에 대해서 미리 제한을 두었기 때문에,
		// 강제타입변환을 할 필요가 없어진다.
		System.out.println("str2 : " + str2);
		
//		암묵적 규칙 :  <T> - Type, <E> - Element, <K> - Key, <V> - Value, <N> - Number
	}

}
