package human19.packageB;

import human19.packageA.B;
//import human19.packageA.*;

class C {
// default 클래스는 동일 PKG에서만 접근 가능
//	A a = new A();
	// A는 default이면서 다른 PKG이므로 접근 불가.
	B b = new B();
	// B는 다른 PKG이지만 public이므로 import 조건하 접근 가능
	C c = new C();
	// C는 자기 자신이므로 접근 가능.
	D d = new D();
	// D는 동일 PKG이면서 public이므로 접근 가능.
}
