package human07;

public class HumanExam04 {

	public static void main(String[] args) {
		// p.181(5장) 연습문제 7. 최대값 구하기
//		int max = -9999;		//max값을 구할 때는 작은 수를 설정해야함.
		int[] array = {1,5,3,8,2};
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
				}			
		}		
		System.out.println("MAX : " + max);
	}
}
