package human15;

public class StringValueOfExam {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		// static(이탤릭체) 메서드. 클래스 차원의 메서드 이므로 String이란 클래스로 메서드를 실행.
		// str1에는 = "10"
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(false);
		// str3 = "false"
		System.out.println(str1 + str2);
		System.out.println(str1.getClass());
		System.out.println(str3.getClass());
		System.out.println(str3.substring(1, 3));
	}
}

