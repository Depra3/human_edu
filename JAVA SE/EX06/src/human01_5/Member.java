package human01_5;

public class Member extends Object {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	// Object가 가지고 있는 equals를 오버라이딩 하여
	// 아래와 같이 재정의함.
	// ** 조건 추가할 경우 &&나 ||같은 것을 이용하는 것도 생각.
	public boolean equals(Member m) {
		if (this.id == m.id) {
			return true;
		}
		return false;
	}

}
