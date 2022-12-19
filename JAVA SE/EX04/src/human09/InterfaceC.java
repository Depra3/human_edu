package human09;

public interface InterfaceC extends InterfaceA, InterfaceB{
	// 인터페이스도 상속받을 수 있다.
	// InterfaceC는 methodC()뿐만 아니라.
	// methodA(), methodB()도 구현해야한다.
	public void methodC();
}
