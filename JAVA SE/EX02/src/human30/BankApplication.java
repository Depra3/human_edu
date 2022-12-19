package human30;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; // 100명의 계좌를 받을 수 있는 공간// Account객체를 이용한 배열
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				creatAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				
			}
		}

		System.out.println("프로그램 종료");
		sc.close();

	}

	private static void creatAccount() { // 계좌 생성 **
		String ano;
		String owner;
		int balance;

		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌 번호 : ");
		ano = sc.next();
		System.out.print("계좌주 : ");
		owner = sc.next();
		System.out.print("초기 입금액 : ");
		balance = sc.nextInt();
		// 입력된 정보를 기반으로 Account 객체 생성
		Account ac = new Account(ano, owner, balance);
		// ac.getAno() / ac.getOwner()....
		
		int i = 0;
		for (i = 0; i < accountArray.length; i++) { // 배열에 주소 넣기
			// accountArray.length = 100
			// accountArray변수에 앞에서 탐색하면서 비어있는 곳에 Account 클래스의 객체를 대입함.(객체 주소 대입)
			// 대입한 순간 break문으로 반복문 빠져나옴.
			// 빠져나올때의 i값이 신규 생성된 계좌가 담긴 위치임.
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				break;
			}
		}
//		System.out.println("결과 : 계좌가 생성되었습니다.");
		System.out.printf("%d번째 자리에 계좌가 생성되었습니다.\n", i + 1);
	}

	private static void accountList() { // 계좌목록보기
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		// 반복문을 통해서 계좌목록을 가져옴.
		// accountArray변수는 Account객체들을 담아놓은 배열변수이므로.
		// i번째 계좌번호를 가져오려면.. accountArray[i].getAno()로 처리가능.
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {	//수정요소 1번째는 비어있고 2번째가 채워져있는 경우. ( 계좌 삭제 필요 ) 
				System.out.println("생성된 계좌가 없습니다.");	
				break;
			}
			System.out.printf("계좌번호 : %s \t 이름 : %s \t 잔고 : %d \n", accountArray[i].getAno(),
					accountArray[i].getOwner(), accountArray[i].getBalance());
		}

	}

	private static void deposit() { // 예금하기
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");

		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		Account ac = findAccount(ano);
		// 사용자가 입력한 ano 값을 기반으로 accountArray배열변수에서 위치를 찾음.
		System.out.print("예금액 : ");
		int deposit = sc.nextInt();

		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance + deposit;
		ac.setBalance(nextBalance);
//		System.out.println("결과 : 예금이 성공하였습니다.");
		System.out.printf("예금이 성공하였으며 현재잔고는 %d입니다.\n", ac.getBalance()); // ac.getBalance() == nextBalance
	}

	private static void withdraw() { // 출금하기
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");

		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		Account ac = findAccount(ano);
		System.out.print("출금액 : ");
		int withdraw = sc.nextInt();

		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance - withdraw;
		ac.setBalance(nextBalance);
		System.out.printf("출금이 성공하였으며 현재잔고는 %d입니다.\n", ac.getBalance()); // ac.getBalance() == nextBalance
	}

	private static Account findAccount(String ano) { // Account 배열에서 ano와 동일한 Account 객체 찾기
		int i = 0;
		for (i = 0; i < accountArray.length; i++) {
			// 사용자가 입력한 ano와 배열변수에 담긴 객체의 ano를 비교해서 같으면 break;
			// break 시점의 i위치에 담긴 accountArray를 리턴
			if (ano.equals(accountArray[i].getAno())) {
				break;
			}
		}
		return accountArray[i];
	}
	

}
