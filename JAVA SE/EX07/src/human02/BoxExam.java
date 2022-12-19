package human02;

public class BoxExam {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setT("human1");
		
		Box b2 = new Box();
		b2.setT(20);
		
		String str1 = (String) b1.getT();
		// b1.getT()는 Object타입으로 되돌려주기 때문에.
		// String 타입으로 변환이 가능함.
		
		int intValue = (int) b2.getT();
		
		System.out.println("str1 : " + str1);
		System.out.println("intValue : " +intValue);
	}
}
