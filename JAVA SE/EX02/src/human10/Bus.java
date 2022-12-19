package human10;

public class Bus {
	public String busNo;
	public int passengerCnt;
	public int income;
	
	public Bus(String busNo, int passengerCnt, int income) {
		this.busNo = busNo;
		this.passengerCnt = passengerCnt;
		this.income = income;		
	}
	
	public void take(int money) {
		this.income = this.income + money;
		passengerCnt++;
	}
}
