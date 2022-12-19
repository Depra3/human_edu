package human21.packageA;

public class B {
	public static void main(String[] args) {
		A a = new A();
		
		a.field1 = 10;
		// field1은 public이므로 동일 PKG, 다른 클래스에서 접근 가능
		a.field2 = 20;
		// field2는 default이지만 동일 PKG라서 다른 클래스에서 접근 가능
//		a.field3 = 30;
		// field3은 private이므로 다른 클래스에서 접근 불가
		
	}
	
}
