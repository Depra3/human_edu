package human23;

public class Car {
	private int maxSpeed;
	// maxSpeed가 300이 넘어가면 문제가 생김.
	public Car() {
		
	}
	public void setMaxSpeed(int speed) {
		if (speed <= 300) {
			this.maxSpeed = speed;
		} else {
			System.out.println("maxSpeed는 300을 넘지 못합니다.");
		}
				
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	

}
