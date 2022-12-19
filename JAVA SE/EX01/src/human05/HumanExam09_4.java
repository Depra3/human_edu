package human05;

public class HumanExam09_4 {

	public static void main(String[] args) {
/*
		 *****	//a=1;	b는 없음;		c=1,2,3,4,5;
		  ****	//a=2;	b=1;		c=2,3,4,5;
		   ***	//a=3;	b=1,2;		c=3,4,5;
		    **	//a=4;	b=1,2,3;	c=4,5;
		     *	//a=5;	b=1,2,3,4;	c=5;
*/
		// System.out.print("*");
		// System.out.println();
		// System.out.print(" ");

		int a, b, c;
		
		for (a = 1; a <=5; a++) {
			for (b = 1; b < a; b++) {	// (b = 1; b <= a-1; b++)
				System.out.print(" ");
			}
			for (c = 5; c >= a; c--) {	// (c = a; c <= 5; c++)
				System.out.print("*");				
			}
			System.out.println();	
		}

	}

}
