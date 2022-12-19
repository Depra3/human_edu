package human03;

public class Car {
	// 멤버 변수
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;

	// 생성자
	// 내용이 있기 때문에 생략이 불가함.
	public Car() {
		this.company = "BMW"; // public String company ="BMW";와 같음
		this.model = "BMW500";
		this.maxSpeed = 300;
		this.currentSpeed = 100;
	}
	
	public Car(String company, String model, int maxSpeed) {
	 	//this : 들어와서 놀고있는 주체 ex) car3 //this.company는 car3의 멤버변수
		//들어오는 인자들(전달해주고 사라짐)과 car3의 인자들의 주소가 다름
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 100;
		
	}
}
