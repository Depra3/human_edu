package human02_1;

public class Child extends Parent{
	public Child() {
		// super는 생성자 생성시 절대적으로 있어야함.(없으면 생략되어있음)
		// super(); 이 코드가 생략되어 있음.
		// super는 생략 가능하다. (단, 인자가 없을 때만)
		// 코드상에서만 생략이지. 컴파일하면 자동으로 만들어냄.
		System.out.println("Child() 생성");
	}
	public Child(int i) {
		// super(); 생략하면 인자가 없는 super가 있음.
		super(i+10);
		// 인자가 있는 부모의 생성자를 호출시에는 생략 불가
		System.out.println("Child(i) 생성");
	}

}
