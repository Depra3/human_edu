package human03;

public class HumanExam04 {

	public static void main(String[] args) {
		// 점수가 60이상이면 합격, 그 중에서도 90점 이상일 경우 장학생 여부를 판별하는 프로그램
		// 60점이하면 불합격, 그 중에서도 40점 이하일 경우는 5년내 시험 자격 불가
		
		// 코드 정렬 : ctrl + shift + f , 주석은 정리 안됨

		int score = 50;
		System.out.printf("score = %d \n", score);
		if (score >= 60) {
			// 60보다 클 경우 실행 문
			System.out.println("당신은 합격하셨습니다.");
			if (score >= 90) {
				// 90보다 클경우 장학생에 관련 로직
				System.out.println("당신은 장학생이 되셨습니다.");
			} else { // 60 <= score < 90
				System.out.println("아쉽게도 장학생은 아닙니다.");
			}
		} else {
			// 60보다 작을 경우 실행문
			System.out.println("당신은 불합격하셨습니다.");
			if (score < 40) {
				System.out.println("당신은 5년내 시험자격이 없습니다.");
			} else {
				System.out.println("당신은 다음회차 시험자격이 있습니다.");
			}
		}
		System.out.println("프로그램 종료합니다.");
	}

}
