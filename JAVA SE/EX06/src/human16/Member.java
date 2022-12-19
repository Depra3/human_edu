package human16;

public class Member implements Comparable<Member> {
	// Comparable 비교 인터페이스
	String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		// Member 객체의 정렬을 위해서는 정렬을 위한 기준이 필요한데,
		// Member 객체에서는 Member 클래스내의 이름을 기준으로
		// 정렬하겠다.
		return this.name.compareTo(o.name);
//		return this.name.compareTo(o.name)*1;	// 오름차순
//		return this.name.compareTo(o.name)*-1;	// 내림차순
	}

}
