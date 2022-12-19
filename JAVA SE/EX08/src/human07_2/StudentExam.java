package human07_2;

import java.util.HashMap;
import java.util.Map;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(1, "강현준");
		Student s2 = new Student(2, "강우혁");
		Student s3 = new Student(3, "강주혁");
		Student s4 = new Student(10, "강현준"); 
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(s1, 80);
		map.put(s2, 90);
		map.put(s3, 100);
		map.put(s3, 95);	// s3라는 객체에 100 ==> 95로 변경.
		map.put(s4, 91);
		// 1. put 메서드 호출시 Key값 기준으로 동일한 것이 있는 지를 확인.
		// 확인 방법.
		// 1. hashCode() 호출 : 다르면 다른 Key이므로 map에 추가.
		// 2. equals() 메서드 호출 : 이 때에도 같으면 같은 Key이므로 map에 추가하지 않음.
		
		System.out.println(map);
		System.out.println(map.get(s1));
		System.out.println(map.get(s4));	// 객체 2개로 하나의 데이터를 컨트롤 하게됨.
	}

}
