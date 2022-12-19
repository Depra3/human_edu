package human02;

public class HumanExam02 {

	public static void main(String[] args) {
		int human1 = 100 * 100 / 5;
		System.out.printf("human1 = %d \n", human1);
		
		int human2 = 50 + 50 * 10;		// 50 + 500 ==> 550
		int human3 = (50 + 50) * 10;	// 100 * 10 ==> 1000
		System.out.printf("human2 = %d \n",human2);
		System.out.printf("human3 = %d \n",human3);

		int human11, human12, human13;
		human11 = human12 = human13 = 100;
		// 대입 연산자는 오른쪽에서 왼쪽으로 대입시킨다. 
		// 위의 한줄과 아래의 내용은 같은 내용임.
//		human13 = 100;
//		human12 = human13;
//		human11 = human12;
		
		System.out.printf("%d / %d / %d", human11, human12, human13);
	}

}
