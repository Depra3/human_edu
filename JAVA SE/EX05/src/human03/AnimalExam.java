package human03;

public class AnimalExam {

	public static void main(String[] args) {
		// ClassCastException
		
		Animal animal = new Dog();
		// 상속관계에서의 자동타입변환
		
		Dog d1 = (Dog)animal;
		// 강제타입변환
		d1.run();
		
		Cat c1 = (Cat) animal;
		// animal은 Dog를 기반으로 자동타입변환한 것이므로
		// animal 객체는 Cat의 객체로 강제타입변환 불가하다.
		// 그래서 ClassCastException이 발생한다.
		// 이를 방지하기 위해서 instanecof 기능을 수행하거나,
		// 또는 Exception에 대한 처리를 해주어야 한다.

	}

}
