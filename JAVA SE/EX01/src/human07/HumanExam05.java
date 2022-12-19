package human07;

public class HumanExam05 {

	public static void main(String[] args) {
		// p.181(5장) 연습문제 7. 최소값 구하기
//		int min = 9999;		//min값을 구할 때는 큰 수를 설정해야함.
		int[] array = {1,5,3,8,2};
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
				if (min > array[i]) {
					min = array[i];
				}			
		}		
		System.out.printf("min : %d \n" , min);
	}
}
