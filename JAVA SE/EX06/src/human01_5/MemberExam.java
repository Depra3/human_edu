package human01_5;

public class MemberExam extends Object {

	public static void main(String[] args) {
		Member m1 = new Member("Blue");
		Member m2 = new Member("Blue");
		Member m3 = new Member("Red");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1 == m2);	// false
		System.out.println(m1 == m3);	// false
		
		System.out.println(m1.equals(m2)); // equals 오버라이딩함
		System.out.println(m1.equals(m3));

	}

}
