package human02_2;

public class Hybride extends Car {
	int elec;

	public Hybride() {
		super();
		System.out.println("Hybirde() 생성");
	}

	public Hybride(int elec) {
		super();
		this.elec = elec;
		System.out.printf("Hybride(%d) 생성\n", elec);
	}

	public Hybride(int elec, int oil) {
		super(oil);
		this.elec = elec;
		System.out.printf("Hybride(%d, %d) 생성\n", elec, oil);
	}
	
	public Hybride(int elec, int oil, int speed) {
		super(oil, speed);
		this.elec = elec;
		System.out.printf("Hybride(%d, %d, %d) 생성\n", elec, oil, speed);
	}

}
