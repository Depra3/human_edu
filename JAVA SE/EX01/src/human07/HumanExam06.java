package human07;

public class HumanExam06 {

	public static void main(String[] args) {
		int[][] array = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } 
		};
		
//		System.out.println("array[0].length = "+ array[0].length);
//		System.out.println("array[1].length = "+ array[1].length);
//		System.out.println("array[2].length = "+ array[2].length);
//		
//		System.out.println("array[0][0] : " + array[0][0]);
//		System.out.println("array[2][4] : " + array[2][4]);
//		System.out.println("array[1][2] : " + array[1][2]);

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				cnt++;
			}
//			cnt = cnt + array[i].length;
		}
		
		avg = (double)sum / cnt;
		
		System.out.printf("SUM : %d \n", sum);
		System.out.printf("AVG : %4.1f \n", avg);

	}

}
