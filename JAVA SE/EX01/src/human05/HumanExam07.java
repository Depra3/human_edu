package human05;

public class HumanExam07 {

	public static void main(String[] args) {
		// rand()난수 - 엑셀
		// rand()==> 0~1사이의 난수 (1 포함X)
		// rand()*6==> 0~6사이의 난수 (6 포함X)
		// rand()*6+1==> 0~7사이의 난수 (7 포함X)
		// (int(rand()*6+1)) ==> 난수에 의해 만들어진 주사위의 눈

//		for(int i = 0; i < 10; i++) {
//			double c;
////			c = Math.random();	//0~1사이의 난수를 만들어줌.
////			c = Math.random()*6;	//0~6사이의 난수를 만들어줌.
//			c = Math.random()*6 +1;	//1~7사이의 난수를 만들어줌.
//			
//			int d = (int) c;
//			
//			System.out.printf("%f / %d \n", c, d);
//		}

		// 1~6까지의 주사위 눈을 생성하는 난수 프로그램. (단, 주사위는 2개)
		// 반복하면서 2개의 주사위의 합이 5가 되면 프로그램 종료하는 로직.
		int a, b;

		while (true) {
			a = (int) (Math.random() * 6) + 1;	// 첫번째 주사위 눈
			b = (int) (Math.random() * 6 + 1);	// 두번째 주사위 눈
			System.out.printf("(%d, %d) ==> %d\n", a, b,a+b);

			if (a + b == 5 || a + b == 10) {
				break;
			}
		}

//		boolean z = true;
//		while (z) {
//			double a1, a2;
//			a1 = Math.random() * 6 + 1; // 1~7사이의 난수 (단, 7을 미포함)
//			a2 = Math.random() * 6 + 1;
//
//			int x1, x2; // 주사위 눈은 정수형으로 선언
//			x1 = (int) a1; // 첫번재 주사위 눈
//			x2 = (int) a2; // 두번째 주사위 눈
//			System.out.printf("(%d, %d) ==> %d \n", x1, x2, x1 + x2);
//
//			if (x1 + x2 == 5 || x1 + x2 == 10) { // x1+x2가 5 또는 10일때의 종료 조건
//				z = false;
//			}
//		}

	}

}
