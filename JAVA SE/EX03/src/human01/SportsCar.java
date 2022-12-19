package human01;

public class SportsCar extends Car {
	// 멤버변수	==> 작성하지 않아도 부모의 currentSpeed 사용가능
	// 생성자		==> 부모의 생성자를 강제로 만들어야함.
	// 메서드		==> 부모의 메서드를 활용할 수 있되, 
	//				자식의 메서드를 추가적으로 더 활용 할 수 있다.
	public SportsCar(int currentSpeed) {	// SportCar 생성과정
		super(currentSpeed);	//==> 부모(Car)의 생성자를 포함
		this.currentSpeed = currentSpeed;
	}
	
	public void turboSpeedUp() {
		this.currentSpeed += 10;
	}

}
