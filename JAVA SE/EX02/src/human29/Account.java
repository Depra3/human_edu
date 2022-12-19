package human29;

public class Account {	//6장 연습문제 19번
	private int balance;					//계좌 잔고  0 < balance <= 1000000
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;

	public Account() {
		this.balance = 0;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
//		if (this.balance + balance > MIN_BALANCE && this.balance + balance <= MAX_BALANCE) {
//			this.balance = this.balance + balance;
		} else {
			System.out.println("계좌 허용한도 이상 또는 이하의 값을 갖게 됩니다.");			
		}
		
	}

}
