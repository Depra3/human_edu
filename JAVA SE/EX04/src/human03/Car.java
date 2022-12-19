package human03;

public class Car {

	public static void main(String[] args) {
		Tire t1 = new HTire();
		// 위의 한줄 코드는 아래의 2줄 코드와 같음.
		// HTire ht = new HTire();
		// Tire t1 = ht;
		// Tire 인터페이스에 H사 타이어를 대입시킨 형태.
		// Tire 인터페이스 t1은 HTire로 구현됨.
		t1.roll();	// "한국타이어"
		
		Tire t2 = new KTire();
		// HTire를 KTire로 바꾸기만 하면 Tire 인터페이스는
		// KTire를 가리키게 됨.
		// 객체를 부품화하여 붙여다 떼었다를 자유자재로 할 수 있음.
		t2.roll();

	}

}
