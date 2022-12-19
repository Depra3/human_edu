package human02;

public class ComputerExam {

	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.search();
		int result = comp.sum(3, 6);
		System.out.printf("result : %d \n", result);
	}

}
