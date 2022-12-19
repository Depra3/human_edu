package human10;

public class Exam {
	public static void main(String[] args) {
		MyInterface if1 = new ClassA();
		if1.method1();
		if1.method2();
		
		MyInterface if2 = new ClassB();
		if2.method1();
		if2.method2();
		
		// 기본적인 방법으로 walking 호출 가능
		ClassA a = new ClassA();
		a.walking();
		
		// 강제타입변환방법으로 walking 호출 가능
		if (if1 instanceof ClassA) {
			ClassA b = (ClassA)if1;
			b.walking();
		}
	}
}
