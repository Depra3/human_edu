package human07_2;

public class Test {
	public void test(String strA, String strB) throws NumberFormatException {
		// 멤버변수 없음.
		// 생성자는 생략. Test(){} 이러한 생성자가 생략.
		
		// throws를 사용하여 호출한 쪽에서 에러처리 할 수 있도록 함.
		// 7을 7_1과 7_2로 분리

		int strIntA = Integer.parseInt(strA);
		int strIntB = Integer.parseInt(strB);
		// a100을 숫자로 변환할 수 없음.
		// 예외발생.

		int intValue = strIntA + strIntB;

		System.out.printf("intValue : %d \n", intValue);
	}

}
