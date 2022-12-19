package human05;

public class HumanExam09_1 {

	public static void main(String[] args) {
/*		
		*		//a=1; b=1;
		**		//a=2; b=1,2;
		***		//a=3; b=1,2,3;
		****	//a=4; b=1,2,3,4;
		*****	//a=5; b=1,2,3,4,5;
*/
		//2중 for문을 사용할 것이고.
		//System.out.print("*");
		//System.out.println();
		
		int a, b;
		
		for (a = 1; a <=5; a++) {	
			for (b = 1; b <= a ; b++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
