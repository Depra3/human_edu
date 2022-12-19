package human01;

public class HumanExam04 {
	public static void main(String[] args) {
		int human = 99;

//		int result = human++ * 10;

/*		human++;
 * 		int result = human * 10; //같이 쓰는 것보다 나누어서 쓰는 것을 권함
 */
		int result = ++human * 10;

/* 		int result = human * 10;
 *		human++;
 */
		System.out.println("human = " + human);
		System.out.println("result = " + result);
		
	}
}
