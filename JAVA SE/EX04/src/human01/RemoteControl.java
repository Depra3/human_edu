package human01;
//	2개 이상의 인터페이스를 implements하여 실제 구현 가능
//	상속은 1개까지 밖에 안됨.
public interface RemoteControl {
//	public abstract interface RemoteControl {	
	// 1. 추상 메서드
	public void turnON();
//	public abstract void turnON();
	// 인터페이스와 인터페이스 내의 메서드는 abstract 라는
	// 키워드가 생략됨
	// 컴파일과정에서 자동으로 생성된다.
	public void turnOff();
	public void setVolume(int volume);
	
	// 2. 상수를 관리할 수 있다. (static final)
	public static int MIN_VOL = 0;
	public static int MAX_VOL = 10;
	
	// 3. default 메서드 (JAVA 8버젼 이후의 기능)
	// 인터페이스로 구현된 구현 클래스 (TV, AUDIO같은 것)들이
	// 공통으로 쓸 수 있는 개념
	//		*메서드 내에서 변수 선언 가능
	default void setMute(boolean mute) {
//		for (int i = 0; i < 10; i++) {}
//		int j = 0;
//		j = 1;
		
		if (mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 4. static 메서드 (인터페이스 차원의 메서드)
	// 					JAVA 8버젼 이후의 기능
	static void changeBatt() {
		System.out.println("배터리를 교체하다.");
	}

}
