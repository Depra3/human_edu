package human22.packageA;

public class B {
	public static void main(String[] args) {
		A a =  new A();
		// 동일 패키지, 다른 클래스
		a.method1();
		// public이므로 접근 가능
		a.method2();
		// default이나 동일 PKG이기 때문에 다른 클래스에서 접근 가능
//		a.method3();
		// private이기 때문에 다른 클래스에서는 어떤 경우라도 접근 불가.
	}

}
