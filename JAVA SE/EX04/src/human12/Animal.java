package human12;

public abstract class Animal extends Creature {

	public Animal(int x, int y, int age) {
		super(x, y, age);
	}
	@Override
	public void attack() {
		System.out.println("동물은 몸을 이용하여 공격함.");
	}
}
