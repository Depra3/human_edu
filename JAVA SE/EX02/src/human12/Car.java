package human12;

public class Car {
	public static String company = "현대차";
	public static String model = "그랜져";
	public static String info;
	public static int sss;

	static { // 정적 필드의 복잡한 초기화 작업을 위한 블록
//		sss = 300;
//		int s=0;	//블록 내에서만 이용가능
		info = company + " - " + model;
	}
	//일반 변수, 메소드는 객체 생성시에 로딩
	//static은 클래스 생성시에 로딩
}
