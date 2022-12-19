package human10;

public class SnowTireExam {
	public static void main(String[] args) {
		SnowTire ST = new SnowTire();
		Tire ti = ST;
//				↑ == ↓		//자동타입변환 / 같은 방식
//		Tire ti1 = new SnowTire();
		
		ST.run();
		ti.run();
	}

}
