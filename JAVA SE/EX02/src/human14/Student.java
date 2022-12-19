package human14;

public class Student {
	// 객체 지향 ? ==> 싱글톤
	// 객체의 수만큼 메모리를 잡아먹음. ==> 기존의 메모리를 계속 사용
	private static Student s = new Student();
	// 외부에서 Student 클래스의 인스턴스 변수를 못 만들도록
	// private으로 막아 놓고,
	// 클래스 내부에서 s라는 인스턴스 변수를 미리 만들어 놓음.

	private Student() {
		//객체생성 막기 위함.
	}
	
	public static Student getInstance() {
		
		return s;
	}
}
