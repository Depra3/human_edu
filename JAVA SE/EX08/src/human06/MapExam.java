package human06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map 컬렉션 추가.
		
		Integer a1 = map.put("강현준", 47);	// 입력받는 값 <String, Integer> - key : value
		Integer a2 = map.put("강우혁", 20);
		Integer a3 = map.put("강주혁", 16);
		Integer a4 = map.put("강주혁", 17);
		// a4에 해당하는 것은 Key가 동일하므로 원래의 Key에 Value를 대입시킴.
		
//		System.out.printf("a1(%d), a2(%d), a3(%d)\n", a1, a2, a3);
		
		// 검색의 기능
		System.out.println("map.size = " + map.size());
		System.out.println("강주혁의 나이 ? " + map.get("강주혁"));
		boolean isEmpty = map.isEmpty();
		System.out.println("map.isEmpty() : " + isEmpty);

//		map.remove("강현준");		// Key값을 지우면 Value값도 지워짐
		
		boolean t1 = map.containsKey("강현준");		// map안에 key로써 존재하는가?		true
		boolean t2 = map.containsValue(47);			// map안에 value로써 존재하는가?		true
		boolean t3 = map.containsKey("강호동");		// map안에 key로써 존재하는가?		false
		boolean t4 = map.containsValue(40);			// map안에 value로써 존재하는가?		false
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		Set<String> keyset = map.keySet();	// map에 있는 key의 내용을 set의 형태로 추출함.
		System.out.println("keyset : " + keyset);
		
		// key를 추출하여 각 key 별로 데이터를 추가로 추출하는 방법.
		Iterator<String> iter = keyset.iterator();	// map의 key값 기준으로 반복할 수 있는 환경 설정.
		while (iter.hasNext()) {
			String key = iter.next();		// key를 추출하는 행위.
			Integer value = map.get(key);	// key에 해당하는 value를 추출하는 행위
			System.out.printf("Key(%s) / Value(%d)\n", key,value);
		}
		System.out.println("----------------------------");
		
		map.remove("강주혁");					// key를 기준으로 value까지 모두 지움.
		iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();		// key를 추출하는 행위.
			Integer value = map.get(key);	// key에 해당하는 value를 추출하는 행위
			System.out.printf("Key(%s) / Value(%d)\n", key,value);
		}
		System.out.println("----------------------------");
		
		map.clear();						// map에 포함된 결과를 모두 지움.
		iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();		// key를 추출하는 행위.
			Integer value = map.get(key);	// key에 해당하는 value를 추출하는 행위
			System.out.printf("Key(%s) / Value(%d)\n", key,value);
		}
		
	}

}
