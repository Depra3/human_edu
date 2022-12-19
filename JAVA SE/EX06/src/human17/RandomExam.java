package human17;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) { // ** 시드에 따른 고정 난수가 있어 보통의 시드는 현재 시간을 가지고 한다.
		long seed1;
		seed1 =System.currentTimeMillis();
		
		int[] selectNum1 = new int[6];
		Random r1 = new Random(seed1);
		
		System.out.print("선택 번호 : ");
		for (int i = 0; i < selectNum1.length; i++) {
			selectNum1[i] = r1.nextInt(45)+1; // 1~45사이의 수
			System.out.printf("%d ",selectNum1[i]);
		}
		System.out.println();
		
		long seed2 = System.currentTimeMillis();
		int[] selectNum2 = new int[6];
		Random r2 = new Random(seed2);
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < selectNum2.length; i++) {
			selectNum2[i] = r2.nextInt(45)+1; // 1~45사이의 수
			System.out.printf("%d ",selectNum2[i]);
		}
		System.out.println();
		System.out.println("---------------------------");
		Arrays.sort(selectNum1);
		Arrays.sort(selectNum2);
		// 오름차순 정렬
		boolean result = Arrays.equals(selectNum1, selectNum2);
		// 각 위치별 비교
		System.out.print("당첨 여부 : ");
		if (result) {
			System.out.println("당첨되었습니다.");
		} else {
			System.out.println("당첨되지 못했습니다.");
		}
		
		

	}

}
