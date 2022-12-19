package human16;

public class Calc {
	public static final double PI = 3.141592;
	// static은 클래스가 로딩 될때 우선 로딩됨.
	// final은 한번 지정되면 변경 불가.
	// 상수처럼 사용할 사용 주로 사용

	public double circle(double r) {
		double z;
		z = r * r * PI; // 원의 넓이 공식
		return z;
	}

}
