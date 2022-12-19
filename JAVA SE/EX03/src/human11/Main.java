package human11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int tvPrice = 100;
		int compPrice = 200;
		int audioPrice = 50;
		
		Buyer buyer1 = new Buyer(1000);
		
		Tv tv = new Tv(tvPrice, "TV");
		Computer computer = new Computer(compPrice, "COMPUTER");
		Audio audio = new Audio(audioPrice, "AUDIO");
		
		boolean z = true;
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		while (z) {
			System.out.println("사실 상품을 입력해주세요");
			System.out.print("1. TV | 2. COMPUTER | 3.AUDIO | 4.정산 : ");
			a = sc.nextInt();
			
			switch (a) {
				case 1:
					buyer1.buy(tv);
					break;
				case 2:
					buyer1.buy(computer);
					break;
				case 3:
					buyer1.buy(audio);
					break;
				case 4:
					buyer1.summary();
					z = false;
					break;
			}
			System.out.println("---------------------------");
		}
		
		sc.close();
		
		
//		buyer1.buy(tv);
//		buyer1.buy(computer);
//		buyer1.buy(tv);
//		buyer1.buy(audio);
//		buyer1.buy(computer);
//		buyer1.buy(computer);
//		buyer1.buy(computer);
//		buyer1.buy(tv);
//		buyer1.buy(audio);
//		buyer1.buy(audio);
//		buyer1.summary();
//		
//		System.out.println("--------------------------");
//		
//		Buyer buyer2 = new Buyer(500);
//		buyer2.buy(tv);
//		buyer2.buy(computer);
//		buyer2.buy(tv);
//		buyer2.buy(computer);		
//		buyer2.summary();
		
	}

}
