package human08;

import java.util.Objects;

public class Student {
	public int sNo;
	public String name;

	public Student(int sNo, String name) {
		this.sNo = sNo;
		this.name = name;
	}

	
	public int hashCode() {
//		return Objects.hash(sNo, name);
		return Objects.hash(name);
		// Object가 가지고 잇는 hashCode 로직을.
		// 멤버변수 기반으로 hashCode를 만드는 것으로 오버라이딩.
	}
	// 해시코드, 객체 생성 관계
	// hash(a)에서 a 기반으로 주소를 정해줌.
	// 같으면 주소를 따로 만들지 않고 새로운 객체에 연결
}
