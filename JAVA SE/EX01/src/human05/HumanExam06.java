package human05;

public class HumanExam06 {

	public static void main(String[] args) {
		// 1~100까지의 정수 중 3의 배수 총합을 구하는 코드 작성
		// 3, 6 , 9,....
		// 3+6+9+.....
		int total=0;
		for (int a = 0; a <= 100; a+=3) {	// a = a + 3 //case 2 : 증감을 3씩 증감
			total = total + a;
			System.out.printf("%d까지의 누적 합 ==> %d \n", a, total);
		}
//		for (int b = 0; b <= 100; b++) {	//case 1 : 나머지를 이용
//			if(b % 3 == 0) {		// a=6 	// a=9		// a=12
//				total = total + b;	//3+6=9 //9+9=18	//18+12=30
//				System.out.printf("%d까지의 누적 합 ==> %d \n", b, total);
//			}
//		}
//		System.out.printf("3의 배수의 합 : %d\n", a);
		
	}

}
