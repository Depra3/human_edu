package human28;

public class MyTvExam {

	public static void main(String[] args) {
		MyTv t = new MyTv();

		t.channel = 100;
		t.volume = 0;
		System.out.printf("CH : %d, VOL : %d \n", t.channel, t.volume);

		t.channelDown();
		t.voulumeDown();
		System.out.printf("CH : %d, VOL : %d \n", t.channel, t.volume);

		t.volume = 100;
		t.channelUp();
		t.voulumeUp();
		System.out.printf("CH : %d, VOL : %d \n", t.channel, t.volume);
		t.channelUp();
		System.out.printf("CH : %d, VOL : %d \n", t.channel, t.volume);
		t.channel = 1;
		t.channelDown();
		System.out.printf("CH : %d, VOL : %d \n", t.channel, t.volume);

	}

}
