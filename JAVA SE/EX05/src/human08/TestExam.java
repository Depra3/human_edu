package human08;

public class TestExam {

	public static void main(String[] args) {
		int value = 120;
		
		Test t = new Test();
		try {
			t.test(value);
		} catch (Exception e) {	//e : "100보다 넘을 경우 프로그래머가 강제로 예외발생"
			System.out.println(e.getMessage());
		}
		
		System.out.println("시스템 종료");
		
	}

}
