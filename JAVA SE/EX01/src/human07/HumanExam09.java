package human07;

import java.util.Scanner;

public class HumanExam09 {

	public static void main(String[] args) {
		//전역 변수
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
//		double avg=0;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = sc.nextInt();
				scores = new int[studentNum]; 	//null값에 덮어 씌우기	//초기화로 인해 입력되어있던 값들이 초기화됨 => 꼬임방지
			} else if (selectNo == 2) {								//번거롭게 다른 변수 이용해서 할 이유가 없어짐.
				if (studentNum == 0) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("score[%d] > ", i);
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				if (scores == null || scores[0] == 0) {
					System.out.println("입력된 정보가 없습니다.");
					continue;
				}
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("score[%d] : %d \n", i, scores[i]);

				}
			} else if (selectNo == 4) {
				if (scores == null || scores[0] == 0) {
					System.out.println("입력된 정보가 없습니다.");
					continue;
				}
				int max = scores[0];//0			//최대값을 구하기 위해서는 작은 수 부터 필요함
				int min = scores[0];//100		//최소값을 구하기 위해서는 큰 수 부터 필요함
				int sum = 0;
				for (int i = 0; i < studentNum; i++) {
					if (max < scores[i]) {				//최고점수
						max = scores[i];
					}
					if (min > scores[i]) {				//최저점수
						min = scores[i];
					}
					sum = sum + scores[i];				//합계
				}
				
//				avg = (double) sum / studentNum;		//평균

				System.out.printf("최고 점수(MAX) : %d \n", max);
				System.out.printf("최저 점수(MIN) : %d \n", min);
				System.out.printf("합계 점수(SUM) : %d \n", sum);
				System.out.printf("평균 점수(AVG) : %2.2f \n", (double)sum/studentNum);//avg

			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				sc.close();
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}