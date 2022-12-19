package human04_1;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		// hashCode는 숫자이므로 문자에만 적용.
		// 숫자에 적용할 수 있으나 숫자에서 숫자이므로 굳이 할 필요가 없음.
		return this.name.hashCode() + this.age;
		// name에 hash코드 적용.
		// m1, m3는 이름과 나이가 같기 때문에.
		// 동일한 hash코드를 갖는다.
	}
	
	public boolean equals(Object obj) {
		// Object obj = new Member("강현준", 47)
		// 자동타입변환 처리가 된 것.
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			// 자동타입변환 후 강제타입변환
			if (this.name.equals(mem.name) && (this.age == mem.age)) {
				// this는 set안에 있는 객체를 의미함.
				return true;
				// this - m1 / mem - m3
			}
		}
		return false;
	}
}
