package human25;

public class MaxSolutionExam {

	public static void main(String[] args) {
		int[] array = { 5, 4, 9, 10, 3, 7 };
		MaxSolution ms = new MaxSolution(array);
		int max = ms.getMax();
		System.out.printf("최대값 : %d \n", max);
		
		int[] array2 = { 1, 4, 9, 19, 3, 7 };
		MaxSolution ms2 = new MaxSolution(array2);
		max = ms2.getMax();
		System.out.printf("최대값 : %d \n", max);
	}

}
