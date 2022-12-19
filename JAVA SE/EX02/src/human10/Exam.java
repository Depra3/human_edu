package human10;

import java.util.Scanner;

public class Exam {
//human07 멤버변수 제약사항
	public static void main(String[] args) {
		Student s1 = new Student(1, "James", 5000);
		Student s2 = new Student(2, "Tomas", 10000);
		Student s3 = new Student(3, "Edward",15000);
		
		Bus b1 = new Bus("100번", 0, 0);
		Bus b2 = new Bus("200번", 0, 0);
		
		Train t1 = new Train("1호선", 0, 0);
		Train t2 = new Train("2호선", 0, 0);
		
		Taxi tx1= new Taxi("1호기",0);
		Taxi tx2= new Taxi("2호기",0);
		Taxi tx3= new Taxi("3호기",0);		
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명 이고, 수입이 %d입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.println("-------------------------------------");
		
		s1.takeBus(b1);
		// 첫번째 학생이. 첫번째 버스를 탄다.
		// 첫번째 학생 : 나의 돈이 1000빠져나감
					//나의 돈이 1000보다 적으면 못탐
		// 첫번째 버스 : 승객이 +1, 수입이 1000늘어남
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명 이고, 수입이 %d입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.println("-------------------------------------");
		
		s2.takeTrain(t2);
		// 두번째 학생이. 두번째 지하철를 탄다.
		// 두번째 학생 : 나의 돈이 1200빠져나감
		// 두번째 지하철 : 승객이 +1, 수입이 1200늘어남
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);
		System.out.printf("%s버스는 승객이 %d명 이고, 수입이 %d입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.printf("%s버스는 승객이 %d명 이고, 수입이 %d입니다. \n", b2.busNo, b2.passengerCnt, b2.income);
		System.out.printf("%s지하철 승객이 %d명 이고, 수입이 %d입니다. \n", t1.trainNo, t1.passengerCnt, t1.income);
		System.out.printf("%s지하철 승객이 %d명 이고, 수입이 %d입니다. \n", t2.trainNo, t2.passengerCnt, t2.income);
		System.out.println("-------------------------------------");
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s3.name, s3.money);
		
		s3.takeTaxi(tx1);
		tx1.showInfo();
		// 세번째 학생이. 택시를 탄다.
		//세번째 학생 : 나의 돈이 10000 빠져나감
		// 택시 : 수입이 10000늘어남		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s3.name, s3.money);
		
		s1.takeTaxi(tx2);
		
//		int a,b,c;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.print("돈을 받는 사람 : ");
//		a = sc.nextInt();
//		System.out.print("돈을 주는 사람 : ");
//		b = sc.nextInt();
//		System.out.print("이동 금액 : ");
//		c = sc.nextInt();
//		
//		switch (a){
//		case 1:
//			if (b == 2) {
//				s1.st( s2, c );
//			}else {
//				s1.st( s3, c);
//			}
//			break;
//		case 2:
//			if (b == 1) {
//				s2.st( s1, c);
//			} else {
//				s2.st( s3, c);
//			}
//			break;
//		case 3:
//			if (b == 2) {
//				s3.st( s2, c);
//			}else {
//				s3.st( s1, c);
//			}
//			break;
//		}
//		sc.close();
//		s1.st(s1, s2);
//		s3.st(s3, s1);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s3.name, s3.money);
	}

}
