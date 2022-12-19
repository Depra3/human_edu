package human05;

public class HumanExam04 {

	public static void main(String[] args) {

//		int a = 1, b = 1;	//while문 쓸 때 변수 초기화 위치 생각
//		while (a < 10) {
//			while (b < 10) {
//				System.out.printf("%d X %d = %d\n", a, b, a*b);
//				b++;
//			}
//			b = 1;		//b를 중복 초기화(하지 말것)
//			System.out.println("-----------");
//			a++;
//		}

		int a, b;
		a = 1;
		while (a < 10) {

			System.out.printf("%d 단 입니다. \n", a);

			b = 1; // b 초기화 위치
			while (b < 10) {
				System.out.printf("%d X %d = %d\n", a, b, a*b);
				b++;
			}
			System.out.println("-----------");
			a++;
		}

	}

}
