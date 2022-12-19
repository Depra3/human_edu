package human04;

public class Human01 {

	public static void main(String[] args) {
		// try / catch / finally 구문 실습
		
		try {
			Human h01 = new Human("KANG");
			h01 = null;
			h01.run();	// 예외 발생 포인트
			
			Human h02 = new Human("KIM");
			h02.run();
		} 
		catch (NullPointerException ne) {
//		catch (Exception ne) {	
			// 모든 예외를 처리할 경우는 Exception으로 처리 가능	
			// 예외처리 부분을 잘 모를 때 상위 예외처리로 가능
			System.out.println("예외가 발생했습니다.");
			System.out.println("ne : " + ne);
			System.out.println(ne.getStackTrace());
			System.out.println(ne.getMessage());
		}
		finally {
			System.out.println("Finally를 실행합니다.");
			// 예외 처리가 제대로 되지 않으면 밖의 코드는 실행 되지 않음
			// 그러나 finally은 무조건 실행함.
			 
		}
		System.out.println("시스템을 종료합니다.");

	}

}

// catch는 try안에서 예외가 발생했을 때 처리하는 로직을 담아둘 수 있음.
// 최상위인 Exception을 catch문으로 처리하면 어떠한 예외도 처리될 수 있으나
// 예외 별로 다르게 로직을 적용하고 싶을때는 개별적인 예외의 종류를 선정해서
// catch문에 담아야 한다.