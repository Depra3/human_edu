package human15;

public class StringIndexOfExam {
	public static void main(String[] args) {
		String subject = "자바프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		System.out.println(subject.indexOf("자바"));
		System.out.println(subject.indexOf("자바를"));
		// 찾는 것이 없을 때는 -1을 되돌려 준다.
		
		if (subject.indexOf("자바") == -1) {
			System.out.println("자바와 관련없는 책");
		} else {
			System.out.println("자바와 관련되어 있는 책");
		}
	}
}
