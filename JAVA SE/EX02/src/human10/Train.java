package human10;

public class Train {
	public String trainNo;
	public int passengerCnt;
	public int income;
	
	public Train(String trianNo, int passengerCnt, int income) {
		this.trainNo = trianNo;
		this.passengerCnt = passengerCnt;
		this.income = income;
	}
	
	public void take(int money) {
		this.income = this.income + money;
		passengerCnt++;
	}

}
