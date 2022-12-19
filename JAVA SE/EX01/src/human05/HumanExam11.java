package human05;

public class HumanExam11 {

	public static void main(String[] args) {
		// 1부터 10까지 출력을 하면서 5보다 작으면 "5이하입니다."라는 것을 출력할 예정.
		// break와 continue 문법에 대한 이해.
		int cnt = 0;
		boolean z = true;
		while (z) {
			cnt++;
			if (cnt > 10) {
				break;	// z =false;
			}
			System.out.printf("cnt = %d \n",cnt);	
//			System.out.printf("cnt = %d \n",cnt);
//			cnt++;
//			if (cnt > 10) {
//				break;	// z =false;
//			}
			
			
//			if(cnt <= 5) {
//				System.out.println("현재의 수치가 5이하입니다.");
//			}
			if (cnt > 5) {
				continue;	//반복문의 조건문으로 되돌아가는 역할.
			}
			System.out.println("현재의 수치가 5이하입니다.");
			
		}

	}

}
