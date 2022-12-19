package human15;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVal1 = new String("강현준");
		String strval2 = new String("강현준");
		
		System.out.println(strVal1 == strval2);
		System.out.println(strVal1.equals(strval2));
		// String 클래스는 최상위 클래스인 Object 클래스를 상속받았고,
		// Equals라는 메서드는 Object가 가지고 있는 메서드인데. 이는 주소값을 비교하는 메서드이지만,
		// String 클래스에서 멤버변수(위의 "강현준")의 값을 비교하도록 오버라이딩 하였기 때문에,
		// Equals 메서드를 사용하면 true가 나온다.
	}

}
