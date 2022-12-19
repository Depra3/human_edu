package human20.packageA;

public class B {
	public static void main(String args[]) {
		A a1 = new A(true);
		// a1은 public은 어디에서든 접근 가능
		A a2 = new A(10);
		// a2는 default이므로 동일 PKG에서 접근 가능
//		A a3 = new A(9.1);
		// a3는 private이므로 다른 클래스에서는 접근 불가 
	}

}
