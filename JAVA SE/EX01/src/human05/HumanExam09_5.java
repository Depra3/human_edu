package human05;

public class HumanExam09_5 {


	public static void main(String[] args) {
		// 4 1 4		a = 1 
		// 3 3 3
		// 2 5 2
		// 1 7 1
		// 0 9 0
		for (int a = 1; a <= 9; a++) {
			if (a <= 5) {//1~5
				for (int i = 1; i <= 5-a; i++) {	//(int i = 5-a; i >= 1; i--)
					System.out.print(" ");					
				}									// 1 2 3 4 5	a
				for (int i = 1; i <= 2*a-1; i++) {	// 1 3 5 7 9
					System.out.print("*");
				}
				for (int i = 1; i <= 11-(2*a); i++) {
					System.out.print(" ");	
				}
				for (int i = 1; i <= 2*a-1; i++) {	// 1 2 3 4 5
					System.out.print("*");			// 1 3 5 7 9
//					if(i==8) {
//						break;
//					}		
				}
				for (int i = 1; i <= 5-a; i++) {
					System.out.print(" ");
				}
				System.out.println();
			} 
			else { //6~9
				for (int i = 1; i <= a-5; i++) {
					System.out.print(" ");					
				}									// 6 7 8 9 /a-5 :1 2 3 4	
				for (int i = 1; i <= 9-2*(a-5); i++) {		// 7 5 3 1
					System.out.print("*");			// 8 7 6 5
				}
				for (int i = 1; i <= 2*a-9; i++) {
					System.out.print(" ");	
				}
				for (int i = 1; i <= 9-2*(a-5); i++) {
					System.out.print("*");
				}
				for (int i = 1; i <= a-5; i++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		for (int a = 1; a <= 9; a++) {
			if (a <= 5) {//1~5
				for (int i = 1; i <= 5-a; i++) {	//(int i = 5-a; i >= 1; i--)
					System.out.print(" ");					
				}									// 1 2 3 4 5	a
				for (int i = 1; i <= 2*a-1; i++) {	// 1 3 5 7 9
					System.out.print("*");
				}
				for (int i = 1; i <= 11-(2*a); i++) {
					System.out.print(" ");	
				}
				for (int i = 1; i <= 2*a-1; i++) {	// 1 2 3 4 5
					System.out.print("*");			// 1 3 5 7 9
//					if(i==8) {
//						break;
//					}		
				}
				for (int i = 1; i <= 5-a; i++) {
					System.out.print(" ");
				}
				System.out.println();
			} 
			else { //6~9
				for (int i = 1; i <= a-5; i++) {
					System.out.print(" ");					
				}									// 6 7 8 9 /a-5 :1 2 3 4	
				for (int i = 1; i <= 9-2*(a-5); i++) {		// 7 5 3 1
					System.out.print("*");			// 8 7 6 5
				}
				for (int i = 1; i <= 2*a-9; i++) {
					System.out.print(" ");	
				}
				for (int i = 1; i <= 9-2*(a-5); i++) {
					System.out.print("*");
				}
				for (int i = 1; i <= a-5; i++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
//		System.out.println("1111*1111111*");
//		System.out.println("111***11111**");
//		System.out.println("11*****111***");
//		System.out.println("1*******1****");
//		System.out.println("*************");
//		System.out.println("1*******1****");
//		System.out.println("11*****111***");
//		System.out.println("111***11111**");
//		System.out.println("1111*1111111*");
	}

}
