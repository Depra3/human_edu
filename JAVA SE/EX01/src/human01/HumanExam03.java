package human01;

public class HumanExam03 {

	public static void main(String[] args) {
		String human1 = "Human"+" "+"Computer"; //문자열 연산자 실습
		//String은 문자열을 담는 클래스.
		System.out.println(human1);
		
		int human2 = 2*6;
		System.out.println(human2);
		
//		int human3 = 9/2;		// 10/2 = 5 , 9/2 = 4 int는 소숫점 날림
		double human3 = 9/2.;	
		// 9/2  "정수/정수 ==> 정수" 이므로 둘 중 하나는 실수로 변환 필요
		// 9/2. "정수/실수 ==> 실수"
		System.out.println(human3);
		
		int human4 = 7%3;		//몫(2), 나머지(1); %는 나머지를 의미
		System.out.println(human4);
		
		int human5 = 1;
		human5 += 3;		//human5 = human5+3;
		System.out.println(human5);
		
		int human6 = 1;
		human6++;			//human6 = human6+1;
		System.out.println(human6);
		++human6;
		System.out.println(human6);

	}

}
