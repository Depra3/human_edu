package human05;

public class HumanExam05 {

	public static void main(String[] args) {
		//홀수 단만 출력할 수 있도록 프로그램을 변경.2201005
		
		int a,b;
		for (a = 1; a < 10; a++) {
		
			if(a % 2 == 1){
				
				System.out.printf("%d 단 입니다. \n",a);
				for (b = 1; b < 10; b++) { //if문 쓰지 않고 b = b + 2 도 가능
					
					if(b % 2 == 1) 	//if문을 이용해 한줄만 사용할 경우 {}가 없어도 됨
						System.out.printf("%d X %d = %d\n", a, b, a*b);
					
					
				}
				System.out.println("-------------");
				
			}
		}

	}

}
