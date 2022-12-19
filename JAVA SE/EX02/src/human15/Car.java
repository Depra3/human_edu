package human15;

public class Car {
	public final String comapny ="현대";
	public final String carId;	
	//생성자에서 초기화하면 오류 사라짐
	//carId는 null인 상태 였다가 한번은 지정 가능함.
	public String model;
	
	public Car(String carId,String model) {
		this.carId = carId;
		this.model = model;
	}

}
