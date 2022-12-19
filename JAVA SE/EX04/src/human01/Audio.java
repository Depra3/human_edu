package human01;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnON() {
		System.out.println("AUDIO를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("AUDIO를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.printf("AUDIO볼륨 : %d \n", this.volume);
	}
}
