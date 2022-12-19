package humanExam.exam1;

public class E3 {
	public static void main(String[] args) {
		String h1 = "휴먼교육센터";
		String h2 = "휴먼교육센터";
		String h3 = new String("휴먼교육센터");
		System.out.println(h1 == h2);
		System.out.println(h1 == h3);
		System.out.println(h1.equals(h3));
		
		int[] ar = new int[2];
		String[] arst = new String[5];
		System.out.println(ar[1]);
		System.err.println(arst[3]);
		
	}
}
