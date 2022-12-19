package human16;

public abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켜다.");
	}
	public void turnOff() {
		System.out.println("전원을 끄다.");
	}
	
	public abstract void display();
	public abstract void typing();

}
