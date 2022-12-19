package human08;

public class Test {
	public void test(int value) throws Exception {
		// value 값이 100이상이면 강제로 예외를 발생시키고 싶음.
		if (value > 100) {
			System.out.printf("예외가 발생함 : %d\n", value);
			throw new Exception("100보다 넘을 경우 프로그래머가 강제로 예외발생");
			// 강제로 예외를 발생시킴.
		}
		System.out.printf("value : %d\n", value);
	}
}