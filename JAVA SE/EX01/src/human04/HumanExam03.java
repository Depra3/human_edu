package human04;

public class HumanExam03 {

	public static void main(String[] args) {
		// for문을 활용하여 1~10까지 누적합 구하기.
		// for문 내에서 변수 선언할 때는 for문 내에서만 됨
		int total = 0;
		int index;		// for문 밖에서 index를 사용하는 부분이 있기 때문에 for문 밖에서 변수 선언함 
		
		for (index = 1; index <= 10; index = index + 1) {
			//index = 1 	==> 초기값 설정
			//index <= 10	==> 반복에 대한 조건
			//index++		==> for문 마감시 처리하는 실행문. 
			
			total = total + index;
//			index = index + 1;		앞에서 설정하지 않아도 for문 내에서 사용가능(다만 일반적이지 않음)
			
			System.out.printf("%d번째 까지의 누적합은 %d입니다. \n", index, total);
		}		
		System.out.printf("index = %d \t total = %d \n", index, total);
		

	}
	

}
