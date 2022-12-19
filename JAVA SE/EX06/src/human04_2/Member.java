package human04_2;

import java.util.Arrays;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] score;
	public Car car;

	public Member(String id, String name, String password, int age, boolean adult, int[] score, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.score = score;
		this.car = car;
	}
	
//	protected Object clone() throws CloneNotSupportedException {
//		// 얕은 복제 내의 clone()메서드에 의해 호출되어 깊은 복제 실행
//		Member cloned = (Member) super.clone();
//		// super.clone() 부모인 Object가 가지고 있는 clone메서드
//		cloned.score = Arrays.copyOf(score, this.score.length);
//		// 기존의 score값을 복제하여 새로운 주소로 만들어 처리.
//		cloned.car = new Car(this.car.model, this.car.speed);
//		// 기존의 car 객체의 속성을 인자로 하여금 새로운 car 객체 생성.
//		
//		return cloned;
//	}
	public Member getMember() {
		// 얕은 복제
		Member cloned = null;
		try {
			cloned = (Member) clone();
			// clone() 메서드의 리턴 타입이 Object이기 때문에 강제타입변환 함.
			cloned.score = Arrays.copyOf(score, this.score.length);		// 깊은
			cloned.car = new Car(this.car.model, this.car.speed);		// 복제
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 복제 기능
		// cloned ==> 복제된 Member를 담아준다.
		return cloned; // 객체 반환
	}
}
