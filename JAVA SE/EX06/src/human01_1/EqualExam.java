package human01_1;

public class EqualExam extends Object {
	// 모든 클래스는 Object라는 클래스를 상속받음.(생략가능)

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		System.out.println("---------------------------");

		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println(obj1 == obj2);
		System.out.println("---------------------------");

		String str1 = new String("강현준");
		String str2 = new String("강현준");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// String 클래스 안에는 equals란 메서드가 있는데.
		// 이 메서드는 각 객체가 가지고 있는 멤버변수간의 비교를 수행하는 기능을 하도록 되어 있다.
		System.out.println("---------------------------");

	}

}
