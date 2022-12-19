package human15;

public abstract class Animal {
	public String kind;	
	// 하위 실체적인 동물들에 대한 분류
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
}
