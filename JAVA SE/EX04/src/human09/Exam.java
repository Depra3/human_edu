package human09;

public class Exam {

	public static void main(String[] args) {
		ClassC c3 = new ClassC();
		InterfaceC ic3 = c3;
		// INterface ic3 = new ClassC();
		ic3.methodA();
		ic3.methodB();
		ic3.methodC();
		
		InterfaceA ic1 = ic3;
		ic1.methodA();
//		ic1.methodB();
		// InterfaceA를 구현한 ic1은 methodB()가 없기 때문에 실행 불가.
		// methodB()는 InterfaceB에서 정의한 것이므로 ┛		
	}

}
