package human09;

public class Child extends Parent{
	private String name;
	
	public Child() {
//		super();	
		// 자식 클래스는 다른 생성자 또는 부모 생성자를 호출한다. 그렇지 않으면 컴파일에서 super()를 추가한다.
		// 이는 생략된 것이 아닌 존재하지 않는 것.
		// 생략된 것이라고 하면 this를 통해 다른 생성자에서
		// super가 호출될 것인데. 그러면 2번 super가 호출되는
		// 효과가 있어서 문법적인로직에 어긋남.
		this("홍길동"); // ==> public Child(String name)으로감
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super(); //생략되어있음
		this.name =name;
		System.out.println("Child(String name) call");
	}
}


