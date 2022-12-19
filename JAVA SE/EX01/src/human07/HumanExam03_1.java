package human07;

public class HumanExam03_1 {

	public static void main(String[] args) {
		// 배열의 초기화, 초기값 미지정시 아래와 같이 정리됨.
		
		int [] array = new int[2];				//정수형 배열 변수로 2개의 방을 만들겠다./초기값 : 0
		double [] arrDouble = new double[2];	//실수형 배열 초기값 : 0.0
		boolean[] arrBoolean = new boolean[2];	//논리형 배열 초기값 : false
		String [] arrstr = new String[5];		//문자형 배열 초기값 : null
		
		System.out.println("array[0] = " + array[0]);
		System.out.println("array[1] = " + array[1]);
		
		System.out.println("arrDouble[0] = " + arrDouble[0]);
		
		System.out.println("arrBoolean[0] = " + arrBoolean[0]);
		
		System.out.println("arrstr[0] = " + arrstr[0]);
		System.out.println("arrstr[1] = " + arrstr[1]);
		
		// 배열의 초기화 방법
		//첫번째 방법
		int [] human1 = {10,20,30};
		
		//두번째 방법
		int [] human2 = new int[3];
		human2[0] = 10;
		human2[1] = 20;
		human2[2] = 30;
		
		//세번째 방법 ==> 2번째 방법 응용. (반복문 활용)
		int [] human3 = new int[3];
		for (int i = 0; i < human3.length; i++) {
			human3[i] = (i+1)*10;			
		}

	}

}
