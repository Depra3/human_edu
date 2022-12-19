package exam0;

public class SmartPhone implements Alram, Phone, Messenger {
	private String phoneNumber;
	
	@Override
	public void playMusic(String title) {
		System.out.println(title + " 이 재생됩니다.");
		
	}

	@Override
	public void beep() {
		System.out.println("삐삐~ 비프음이 재생됩니다.");
		
	}
	
	@Override
	public void sendMsg(String phoneNum, String msg) {
		System.out.println(phoneNum + " 로 다음 메세지를 전송합니다.");
		System.out.println(msg);
	}

	@Override
	public void receiveMsg() {
		System.out.println("메세지가 도착하였습니다.");
	}

	@Override
	public void makeCall(String phoneNum) {
		System.out.println(phoneNum + " 로 전화를 겁니다.");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 받습니다.");
		
	}

	

}
