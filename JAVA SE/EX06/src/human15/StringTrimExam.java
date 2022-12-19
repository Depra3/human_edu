package human15;

public class StringTrimExam {	// ** 공백지우기 많이 사용 / ex) 로그인문제

	public static void main(String[] args) {
		String tel1 = "          02";
		String tel2 = "          1234             ";
		String tel3 = "6789           ";

		System.out.println(tel1 + "-" + tel2 + "-" + tel3);
		System.out.println(tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim());

	}

}
