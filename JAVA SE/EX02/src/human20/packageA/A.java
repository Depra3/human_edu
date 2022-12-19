package human20.packageA;

public class A {
	public A(boolean b){
		System.out.println("a1 생성");
	}
	A(int i){
		// 생략 된것은 default
		System.out.println("a2 생성");
	}
	private A(double d){
		System.out.println("a3 생성");
	}
	
	public static void main(String args[]) {
		A a1 = new A(true);
		A a2 = new A(10);
		A a3 = new A(9.1);
		//자기 자신이므로 모두 접근 가능
	}
}
