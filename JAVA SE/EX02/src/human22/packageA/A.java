package human22.packageA;

public class A {
	public void method1() {
		System.out.println("public method1 실행");
	}
	void method2() {
		System.out.println("default method2 실행");
	}
	private void method3() {
		System.out.println("private method3 실행");
	}
	
	public static void main(String[] args) {
		A a =  new A();
		a.method1();
		a.method2();
		a.method3();
		// 자기 자신의 메서드는 접근 제한자에 상관없이 모두 접근가능.
	}
}
