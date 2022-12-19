package exam0;

public class Person {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		Alram alram = sp;
		Phone phone = sp;
		Messenger messenger = sp;
		alram.playMusic("Happy Things");
		alram.beep();
		
		phone.makeCall("010-1234-5678");
		phone.receiveCall();
		
		messenger.sendMsg("010-1234-5678", "넌 누구니?");
		messenger.receiveMsg();
	}
}
