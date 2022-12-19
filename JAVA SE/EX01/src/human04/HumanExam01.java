package human04;

public class HumanExam01 {

	public static void main(String[] args) {
		// 1~10까지 누적합산
		
		int index = 0;
		int total = 0;
		
		while (index < 10) {
			index = index +1;		// index +=1; 또는 index++; 와 같음
			total = total + index;	// total +=index; 와 같음	
			System.out.printf("%d번째 까지의 누적합은 %d임. \n", index ,total);
			
		}
		System.out.println("-------------------------");
		System.out.printf("index = %d \t total = %d \n", index, total);

	}

}
