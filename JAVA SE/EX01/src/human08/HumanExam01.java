package human08;

public class HumanExam01 {
	//같은 패키지 내에서 참조가능
	public static void main(String[] args) {
		System.out.println(Week.values());
		System.out.println(Week.valueOf("SUN"));	//week내에 없을 경우 오류뜸
		System.out.println(Week.FRI);
	}
}