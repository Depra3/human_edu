package human07;

public class HumanExam07 {

	public static void main(String[] args) {
		// args 사용방법.
		// run Configurations -> arguments -> Program arguments
//		System.out.printf("args[0] = %s \n", args[0]);
//		System.out.printf("args[1] = %s \n", args[1]);
//		
//		int z = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
//		
//		System.out.println(z);

		String[][] arstr = new String[3][3];

		for (int i = 0; i < arstr.length; i++) {
			for (int j = 0; j < arstr.length; j++) {

				if (i == 1 && j == 1) {
					arstr[i][j] = " ";
					continue;
				}
				arstr[i][j] = "*";
			}
		}

		int a = 0, b = 0;

		for (int i = 0; i < arstr.length; i++) {

			for (int j = 0; j < arstr[i].length; j++) {

				System.out.print(arstr[i][j]);
				b++;

				if (b % arstr[i].length == 0) {
					j = -1;
					if (b == 12) {
						j = arstr[i].length;
					}
				}
			}
			System.out.println();
			a++;

			if (a % arstr.length == 0) {
				i = -1;
				if (a == 9) {
					break;
				}
			}
			b = 0;
		}
	}
}
