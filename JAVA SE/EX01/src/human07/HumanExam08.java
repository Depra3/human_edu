package human07;

public class HumanExam08 {

	public static void main(String[] args) {
		// 최대, 최소 , 합계를 구하는 프로그램 (함수를 이용해서)
		int max, min, sum;
		
		int[] arr1 = { 1, 5, 3, 8, 2 };
		max = searchMax(arr1);
		min = searchMin(arr1);
		sum = doSum(arr1);
		System.out.printf("MAX : %d	\n", max);
		System.out.printf("MIN : %d \n", min);
		System.out.printf("SUM : %d \n", sum);

		int[] arr2 = { 10, 20, 5, 30, 1, -99, 100 };
		max = searchMax(arr2);
		min = searchMin(arr2);
		sum = doSum(arr2);
		System.out.printf("MAX : %d	\n", max);
		System.out.printf("MIN : %d \n", min);
		System.out.printf("SUM : %d \n", sum);
	}

	private static int searchMax(int[] arr) { // int[] arr = arr1
		// 첫번째는 arr = { 1, 5, 3, 8, 2 }
		// 두번째는 arr = { 10, 20, 5, 30, 1, -99, 100 }
		int max = -9999;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}	

	private static int searchMin(int[] arr) {		
		int min = 9999;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	private static int doSum(int[] arr) {
		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];			
//		}
		for (int arrValue : arr) {	//위와 같은 결과	//향상된 for문 //1차 배열 O / 2차 배열 X
			sum = sum + arrValue;
		}
		return sum;

//		int[][] score = {
//				{10,20,30,40},
//				{50,60,70,80},
//				{90,100,110,120}
//		};
//		
//		int total;
//		
//		for(int i = 0; i < score.length; i++) {		//2차배열은 다른 방식으로 해야함.
//			for (int s : score[i]) {	// s = score[i]
//				total = total + s;
//			}
//		}
	}

}
