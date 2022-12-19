package human04;

public class HumanExam02 {

	public static void main(String[] args) {
		// do ~ while 반복문 실습 / for 80% > while 20% > do~while 1%? 사용 빈도
		
		int index = 0;
		int total = 0;
		
		do {
			index = index + 1;		// index++;			
			
			if (index == 5) {
//				index = 10;
				continue;
			}	//바로 조건문으로 넘어감
			
			total = total + index;	// total += index;
			
			System.out.printf("%d번째 까지의 누적 합은 %d \n", index, total);
			
		} while (index < 10);
		
		System.out.printf("index = %d \t total =%d \n", index, total);

	}

}