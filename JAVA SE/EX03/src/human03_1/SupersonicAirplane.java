package human03_1;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NORMAL;
	//아래의 생성자는 생략가능
	public SupersonicAirplane() {
		super();
	}
	@Override // 오버라이딩인지 아닌지 구별 가능하게 함
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			// 부뫄 가지고 있는 일반비행을 처리하고 싶음.
			super.fly();
		}
			
	}
}
