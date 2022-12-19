package human10;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("MyInterface가 method2 호출.");
	}
	// default 메서드는 구현클래스에 공통적으로 적용할 기능.
	// 특정 구현클래스에서 다르게 사용하고 싶다면, 
	// 그 클래스에서 오버라이딩하면 됨.
}
