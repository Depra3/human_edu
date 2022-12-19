package human15;

public class StringSplitExam {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,강현준'김자바-최명호";
		String[] names = text.split("&|,|-");

//		for (String n : names) {
//			System.out.println(n);
//		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}
