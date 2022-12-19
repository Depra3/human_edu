package human15;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog1 = new Dog("포유류");
		dog1.breathe();
		dog1.sound();
		
		Cat cat1 = new Cat("포유류");
		cat1.sound();
		System.out.println("-----------------");
		Animal animal1 = new Cat("포유류");	// 다형성
		// 상속관계에서 자동타입변환
		animal1.breathe();
		animal1.sound();
		
		Animal animal2 = new Dog("포유류");
		// 상속관계에서 자동타입변환
		animal2.breathe();
		animal2.sound();
		System.out.println("-----------------");
		// 아래는 강제타입변환 실습
		// Animal animal1 = new Cat("포유류");
		System.out.printf("animal1 instanceof Cat : %b \n", animal1 instanceof Cat);
		if (animal1 instanceof Cat) {
			Cat cat2 = (Cat)animal1;
			cat2.sound();
		}
		// Animal animal2 = new Dog("포유류");
		System.out.printf("animal2 instanceof Dog : %b \n", animal1 instanceof Dog);
		if (animal1 instanceof Dog) {
			Dog dog2 = (Dog)animal1;
			dog2.sound();
		}
		
		animalSound(new Dog("포유류"));
		// 아래와 같은 코드
//		Dog dog3 = new Dog("포유류");
//		animalSound(dog3);
		animalSound(new Cat("포유류"));
		System.out.println("---------");
		// 자동타입변환, 강제타입변환(체크로직)
		Animal ani = new Cat("포유류");
		if (ani instanceof Cat) {
			Cat c0 = (Cat) ani;
			c0.sound();
		}
	}
//	private static void animalSound(Dog dog) {
//		dog.sound();	
//	}
//	private static void animalSound(Cat cat) {
//		cat.sound();
//	}			↑ == ↓ 통합 가능 - 다형성 / 11 product와 유사
	private static void animalSound(Animal animal) {
		animal.sound();
	}

	

}
