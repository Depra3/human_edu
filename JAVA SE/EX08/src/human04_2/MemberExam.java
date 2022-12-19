package human04_2;

import java.util.HashSet;
import java.util.Set;

public class MemberExam {

	public static void main(String[] args) {
		Member m1 = new Member("강현준", 47);
		Member m2 = new Member("강우혁", 20);
		Member m3 = new Member("강현준", 46);
		
		Set<Member> set = new HashSet<Member>();
		boolean result1 = set.add(m1);
		// add 메서드 안에는 hashCode() 호출 ==> equals() 메서드 호출
		// 1. hashCode가 다르면 다른 객체로 인지.
		// 2. hashCode가 같고, equals()통해서 같은 것이라고 인식한다면,
		// ==>같은 객체로 인식 / 오버라이딩이 필요
		boolean result2 = set.add(m2);
		boolean result3 = set.add(m3);
		System.out.println(set.size());
		
		System.out.printf("m1(%b) / m2(%b) / m3(%b)\n", result1, result2, result3);
	}

}
