package human14;

public abstract class Shape {
	// 설계자가 원하는 기능은 면적을 구하는 것임.
	// 어떤 도형이 올지 모르기 때문에 도형별로 클래스를 만들고.
	// 도형은 shape을 상속받아서 면적을 구하는 클래스를 완성해야함.
	// 설계자 입장에서 꼭 면적을 구하는 메서드는 각 도형에서 해야한다는 것을
	// 명시하기 위해서는 추상 메서드가 필요함.
	// 공통적인 부분을 넣어야 함. 주석부분 삭제
//	double r;
//	double width;
//	double height;

//	public Shape(double r) {
//		this.r = r;
//	}

//	public Shape(double width, double height) {
//		this.width = width;
//		this.height = height;
//	}

	public abstract double calcArea();
}
