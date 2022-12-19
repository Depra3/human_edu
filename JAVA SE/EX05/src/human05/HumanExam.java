package human05;

public class HumanExam {

	public static void main(String[] args) {
		// NullPointerException - NumberFormatException
		// 예외 발생시 밑의 코드는 실행하지 않고 바로 catch문으로 넘어감
		try {
			Human h01 = new Human("KANG");
			h01 = null;
//			h01.run();  // 예외발생 포인트 (NullPoint)

			String str = "a100";
			int intValue = Integer.parseInt(str);
			// 정수로 변환할 수 없는 예외 발생.
			System.out.printf("intValue : %d \n", intValue);

			System.out.println("로직 정상 종료");
		} 
//		catch (RuntimeException re) {
//			System.out.println("NullPointerException 발생");
//		} 상위 예외처리가 맨위에서 예외처리 할 경우 하위 예외 처리가 필요없어짐에 따라 오류발생 
		catch (NullPointerException ne) {
			System.out.println("NullPointerException 발생");
		} catch (NumberFormatException fe) {
			System.out.println("NumberFormatException 발생");
		} finally {
			System.out.println("Finally 출력됨");
		}

		System.out.println("프로그램 정상 종료");
		
	}

}
