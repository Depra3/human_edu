package human03;

public class HumanExam05_2 {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("당신은 VIP 회원입니다.");
			break;
		case 'B':
			System.out.println("당신은 일반회원입니다.");
			break;
		default:
			System.out.println("당신은 비회원입니다.");
			break;
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
