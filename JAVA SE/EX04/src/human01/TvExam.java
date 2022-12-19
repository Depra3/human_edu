package human01;

public class TvExam {
	
	public static void main(String[] args) {
//		RemoteControl rc = new Television();
		Television tv = new Television();
//		Audio au = new Audio();
		RemoteControl rc = tv;	// 자유자재로 변경가능
//		RemoteControl rc = au;	
		// rc는 구현 객체이고, Television는 구현 클래스의 객체
		rc.turnON();
		rc.setVolume(5);
//		rc.setMute(false);	// 무음해제
		rc.setMute(true);
		rc.setVolume(RemoteControl.MIN_VOL);
		// RemoteControl.MIN_VOL ==> 0
		// 그래서 rc.setVolume(0)와 같은 동작을 함.
		rc.turnOff();
		RemoteControl.changeBatt(); // 객체로 부르지 못함.
		
		System.out.println("-----------------");

		Audio au = new Audio();
		RemoteControl rc2 = au; // rc = rc2
		rc2.turnON();
		rc2.setVolume(5);
		rc2.setMute(false);	// 무음해제
		rc2.setVolume(RemoteControl.MIN_VOL);
		// RemoteControl.MIN_VOL ==> 0
		// 그래서 rc.setVolume(0)와 같은 동작을 함.
		rc2.turnOff();
		RemoteControl.changeBatt(); // 객체로 부르지 못함.
	}
}
