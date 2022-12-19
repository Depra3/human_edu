package human02;

public class HumanExam05 {

	public static void main(String[] args) {
		int human1 = 100;
		int human2 = 80;
		
		boolean result1 = (human1 == 100) && (human2 == 80);	//true , true ==> true
		System.out.printf("result1 = %b \n", result1);
		
		boolean result2 = (human1 >= 100) && (human2 < 80);		//true , false ==> false
		System.out.printf("result2 = %b \n", result2);
		
		boolean result3 = (human1 != 100) && (human2 >= 80);	//false , true ==> false
		System.out.printf("result3 = %b \n", result3);
		
		boolean result4 = (human1 != 100) && (human2 != 80);	//false , false ==> false
		System.out.printf("result4 = %b \n", result4);
		System.out.printf("--------------------\n");
		
		boolean result5 = (human1 == 100) || (human2 == 80);	//true , true ==> true
		System.out.printf("result5 = %b \n", result5);
		
		boolean result6 = (human1 >= 100) || (human2 < 80);		//true , false ==> true
		System.out.printf("result6 = %b \n", result6);
		
		boolean result7 = (human1 != 100) || (human2 >= 80);	//false , true ==> true
		System.out.printf("result7 = %b \n", result7);
		
		boolean result8 = (human1 != 100) || (human2 != 80);	//false , false ==> false
		System.out.printf("result8 = %b \n", result8);
		System.out.printf("--------------------\n");
		
		boolean result9 = (human1 == 100) ^ (human2 == 80);		//true , true ==> false
		System.out.printf("result9 = %b \n", result9);
		
		boolean result10 = (human1 >= 100) ^ (human2 < 80);		//true , false ==> true
		System.out.printf("result10 = %b \n", result10);
		
		boolean result11 = (human1 != 100) ^ (human2 >= 80);	//false , true ==> true
		System.out.printf("result11 = %b \n", result11);
		
		boolean result12 = (human1 != 100) ^ (human2 != 80);	//false , false ==> false
		System.out.printf("result12 = %b \n", result12);
		System.out.printf("--------------------\n");
		
		boolean result13 = !(human1 == 100);
		System.out.printf("result13 = %b \n", result13);
		
		boolean result14 = !((human1 == 100) || (human2 == 80));
		// true || true ==> true ==> !true ==> false
		System.out.printf("result14 = %b \n", result14);

	}

}
