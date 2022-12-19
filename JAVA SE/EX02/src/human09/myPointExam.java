package human09;

public class myPointExam {

	public static void main(String[] args) {//sqrt 는 루트
//		System.out.println(Math.sqrt(4));	//2.0 * 2.0 == 4
//		System.out.println(Math.sqrt(9));	//3.0 * 3.0 == 9
		
		MyPoint p = new MyPoint(1, 1);
		System.out.printf("두 점 사이의 거리는 = %f\n",p.getDistance(2, 3));
		System.out.printf("두 점 사이의 거리는 = %f\n",p.getDistance(2, 2));
		System.out.printf("두 점 사이의 거리는 = %f\n",p.getDistance(0, 0));
		System.out.printf("두 점 사이의 거리는 = %f\n",p.getDistance(5, 4));
	}

}
