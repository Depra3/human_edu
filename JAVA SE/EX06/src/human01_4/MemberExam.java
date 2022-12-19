package human01_4;

public class MemberExam extends Object {

	public static void main(String[] args) {
		Member m1 = new Member(47, 100);
		Member m2 = new Member(47, 90);
		Member m3 = new Member(20, 80);
		
		Student s1 = new Student(47, 100);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1 == m2);	// false
		System.out.println(m1 == m3);	// false
		
		System.out.println(m1.equals(m2)); // equals 오버라이딩함
		System.out.println(m1.equals(m3));
		
		System.out.println(m1.equals(s1)); 
		// Member 클래스와의 관계가 되어있지 않아 강제타입변환 불가

	}

}
