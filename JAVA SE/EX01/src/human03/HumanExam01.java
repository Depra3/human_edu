package human03;

public class HumanExam01 {

	public static void main(String[] args) {
//		60점 이상이면 합격입니다. 출력 ==> 마지막으로는 프로그램 종료. 메시지를 주는 프로그램
		
		int kor = 50;
		System.out.printf("점수 = %d \n",kor);
		
		if (kor >= 60) {	
			//조건식은 관계연산식이고, 이 부분이 참이면 블럭안을 수행.
			System.out.println("합격하셨습니다.");
		}
		if (kor < 60) {
			System.out.println("불합격하셨습니다.");
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
