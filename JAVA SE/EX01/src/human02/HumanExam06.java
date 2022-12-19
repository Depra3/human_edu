package human02;

import java.util.Scanner;

public class HumanExam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//키보드로부터 입력받겠다.
		int age;
		System.out.print("당신의 나이를 입력하세요. ");
		age = sc.nextInt();			//정수만 받음
		System.out.printf("age = %d \n", age);
		sc.nextLine();		//nextInt 등 찌꺼기가 남아서 강제로 찌꺼기 소화.
		
		System.out.print("당신의 이름은? ==> ");
		String name;
		name = sc.nextLine();		//문자형으로 받음 next()는 띄어쓰기 인식X
		System.out.printf("당신의 이름은 %s입니다. \n", name);
		
		System.out.print("오늘의 온도는? ==> ");
		double temperature;
		temperature = sc.nextDouble();
		System.out.printf("오늘의 온도는 %10.1f 도 입니다. \n", temperature);
		//%10.1f ==> 10만큼의 공간을 부여, 소수점 1자리까지.
		
		int a, b;
		System.out.print("a = ");
		a = sc.nextInt();		
		System.out.print("b = ");
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("a = %d, b = %d \n", a, b);
		boolean c = (a > 50) && (b <= 50) ;
		System.out.printf("a && b = %b \n", c);
		
		boolean d = (a > 50) || (b <= 50) ;
		System.out.printf("a || b = %b \n", d);
		
		boolean e = (a > 50) ^ (b <= 50) ;
		System.out.printf("a ^ b = %b \n", e);
		
		boolean f = !(a > 50);
		System.out.printf("!a = %b \n", f);
		
		boolean g = !(b <= 50);
		System.out.printf("!b = %b \n", g);
		
//		String A;// = "e";
//		System.out.print("글자 = ");
//		A = sc.nextLine();
//		System.out.printf("%s다. \n",A);
//		
//		boolean B = "e".equals(A);		// ==는 숫자열 비교
//		System.out.printf("%b",B);
		
		
		
		sc.close(); //Scanner 마무리, 메모리에 여유를 줌
	}

}
