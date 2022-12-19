package human01;

public class Television implements RemoteControl {
	private int volume;
	@Override
	public void turnON() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.printf("TV볼륨 : %d \n", this.volume);
	}
	// 인터페이스의 default 메서드는 구현클래스에서
	// 오버라이딩 할 수 있다.
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.volume = 1;
			System.out.printf("TV볼륨 : %d \n", this.volume);
		}
	}
}
