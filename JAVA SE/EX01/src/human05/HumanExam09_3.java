package human05;

public class HumanExam09_3 {

	public static void main(String[] args) {
/*
		     *	//a=1;	b=1,2,3,4;	c=5;
		    **	//a=2;	b=1,2,3;	c=4,5;
		   ***	//a=3;	b=1,2;		c=3,4,5;
		  ****	//a=4;	b=1;		c=2,3,4,5;
		 *****	//a=5;	b는 없음;		c=1,2,3,4,5;
*/
		// System.out.print("*");
		// System.out.println();
		// System.out.print(" ");

		int a, b, c;
		
		for (a = 1; a <=5; a++) {
			for (b = 5; b > a; b--) {	//(b = 1; b <= 5-a; b++)
				System.out.print(" ");
			}
			for (c = 1; c <= a; c++) {	//(c = 6-a; c <= 5; c++)
				System.out.print("*");
				
			}
			System.out.println();	
		}

	}

}
