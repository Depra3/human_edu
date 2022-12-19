package human01;

public class Human01 {
	public static void main(String[] args) {
		// 1. NullPointerException 사례.
		// 객체 생성 후 객체가 가리키는 heap주소 null로 변경시
		Human h01 = new Human("KANG");
		h01.run();
		System.out.println(h01);
		h01 = null;
		System.out.println(h01);
		
		h01.run();	// nullpointException
		
		// 2. 배열 변수에 null로 초기화 한 후 배열내의 값을 접근할 경우.
		int[] intValue = null;
		System.out.printf("intValue[0] = %d\n",intValue[0]);
		
	}

}
