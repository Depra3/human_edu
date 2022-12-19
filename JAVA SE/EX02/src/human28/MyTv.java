package human28;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void turnOnOff() {
		// isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
//		if (this.isPowerOn == true) {
//			this.isPowerOn = false;
//		} else {
//			this.isPowerOn = true;
//		}
		this.isPowerOn = ! this.isPowerOn;
		// boolean 형태는 true/false 2가지만 있기 때문에 NOT의 연산자를 처리할 수 있다.
		
	}

	public void voulumeUp() {
		// volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
		if (this.volume < MAX_VOLUME) {
			this.volume++;
		}
	}

	public void voulumeDown() {
		// volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
		if (this.volume > MIN_VOLUME) {
			this.volume--;
		}
	}

	public void channelUp() {
		// channel의 값을 1 증가시킨다.
		// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		
		// 채널이 100인 상태에서 올릴 경우 1이 되어야 하므로,
		// 채널에 MIN_CHANNEL 대입하면 1이 되니 추가적으로 채널에 1을 더할 필요가 없으니 
		// else를 이용하여 추가적으로 증가하는 것을 막는다.
		// channelDown()에서도 원리는 같다.
		if (this.channel == MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
		} else {  
			this.channel++;
		}

	}

	public void channelDown() {
		// channel의 값을 1 감소시킨다.
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		if (this.channel == MIN_CHANNEL) {
			this.channel = MAX_CHANNEL;
		} else {
			this.channel--;
		}

	}

}
