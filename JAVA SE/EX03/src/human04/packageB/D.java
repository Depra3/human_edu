package human04.packageB;

import human04.packageA.A;

//public class D extends human04.packageA.A{
public class D extends A{
	// A클래스를 상속받은 D클래스
	public D() {
		super();	// A클래스 생성자 사용 가능
	}
	private void mina() {
		D d = new D();
		d.field = 1;
		d.method();
		// 상속을 통해서 만들어진 클래스 객체는
		// 상속된 멤버변수, 메서드를 활용할 수 있다.
		
		d.field1 = 2;
		// public 접근자이므로 접근 가능
//		d.field2 = 3;
		// 아무리 상속을 받는다 한들 default는 다른 PKG에서
		// 접근 불가함.
//		d.field3 = 4;
		// private으로 정의된 멤버변수, 메서드는
		// 다른 클래스에서 절대 접근 불가.

	}

}
