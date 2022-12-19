package human02;

public class Child extends Parent {
	public Child() {
		super();	// Parent() 생성자 호출
		System.out.println("Child() 생성자 호출");
	}
	
	public Child(int i) {
		super(i);	// Parent(i) 생성자 호출
		System.out.println("Child(i) 생성자 호출");
	}

}
