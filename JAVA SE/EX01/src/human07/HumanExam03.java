package human07;

public class HumanExam03 {

	public static void main(String[] args) {
		int[][] score = {	{ 10, 20, 30, 40 }, 
							{ 50, 60, 70, 80 }, 
							{ 90, 100, 110, 120 } 
						};
		int total = 0;
		
		System.out.println("score = " + score);
		System.out.println("score[0] = " + score[0]);	//{ 10, 20, 30, 40 }에 대한 주소값
		System.out.println("score[0][0] = " + score[0][0]);
		System.out.println("score[0][1] = " + score[0][1]);
		System.out.println("score[0][2] = " + score[0][2]);
		System.out.println("score[1][2] = " + score[1][2]);
		
		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		
		System.out.println("score = " + score.length);			//3개
		System.out.println("score[0] = " + score[0].length);	//4개
		System.out.println("score[1] = " + score[1].length);	//4개
		System.out.println("score[2] = " + score[2].length);	//4개
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total = total + score[i][j];
			}			
		}
		System.out.printf("total = %d \n", total);			

	}

}
