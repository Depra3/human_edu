package human12;

public class CarExam {

	public static void main(String[] args) {
//		int a;
		Car car1 = new Car();
//		car1.company; 
		String str1 = Car.company;
		// static은 객체 차원이아닌 클래스 차원이므로 객체를 주체로하여
		// 접근하지 않고, 클래스를 주체로 접근한다.
		String str2 = Car.model;
		String str3 = Car.info;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
//		System.out.println(Car.sss);
//		a = car1.sss;
//		System.out.println(a);
//		Car.sss;
	}
}
