package human99;

public class ArrayExam {

	public static void main(String[] args) {
		Array[] ar = new Array[5];

		int a = 0;
		int b = 1;
		int c = 0;

		Array ab = new Array(a, b, c);
		
		System.out.println(ar);
		System.out.println(ab);
		System.out.println("----");

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = ab;
				System.out.println(ar[i]);
				System.out.println("----");
			}
			System.out.println(ar[i].a + " | " + ar[i].b + " | " + ar[i].c);
			System.out.println("-------");

		}
		System.out.println(ar);

	}

}
