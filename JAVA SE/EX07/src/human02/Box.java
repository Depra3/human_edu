package human02;

public class Box {
	// Object는 모든 클래스의 상위 클래스.
	// Object는 String의 상위 클래스, Integer의 상위 클래스
	private Object t;
	
	public Box() {
	}

	public Object getT() {
		return this.t;
	}

	public void setT(Object t) {
		// Object t = "human1"
		// String을 상위인 Object에 대입. 자동타입변환.
		
		// Object t = 20;
		// Integer를 상위인 Object에 대입. 자동타입변환.
		this.t = t;
	}
}
