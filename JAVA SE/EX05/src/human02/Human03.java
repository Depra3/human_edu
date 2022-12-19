package human02;

public class Human03 {
	public static void main(String[] args) {
		// NumberFormatException

		String strValue01 = "1000";
		int intValue01 = Integer.parseInt(strValue01);
		// Integer 클래스의 static 메서드인 parseInt는 숫자로 변환함.
		int intplus01 = intValue01 + 10;
		System.out.printf("intplus : %d \n", intplus01);
		
		String strValue02 = "a1000";
		int intValue02 = Integer.parseInt(strValue02);
		// strValue02는 숫자로 변환할 수 없는 형태이므로 Exception발생 
		int intplus02 = intValue02 + 10;
		System.out.printf("intplus : %d \n", intplus02);
	}

}
