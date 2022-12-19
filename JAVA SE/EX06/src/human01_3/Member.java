package human01_3;

public class Member extends Object {
	public int age;
	public int score;

	public Member(int age, int score) {
		this.age = age;
		this.score = score;
	}

	// Object가 가지고 있는 equals를 오버라이딩 하여
	// 아래와 같이 재정의함.
	// ** 조건 추가할 경우 &&나 ||같은 논리 연산자를 이용하는 것도 생각.
	public boolean equals(Member m) {
		// Member m = m2;
		if (this.age == m.age && 
				this.score == m.score) {
			return true;
		}
		return false;
	}

}
