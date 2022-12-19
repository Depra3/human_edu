package human10;

public class Taxi {
	public String TaxiNo;
	public int income;

	public Taxi(String TaxiNo, int income) {
		this.TaxiNo = TaxiNo;
		this.income = income;
	}

	public void take(int money) {
		this.income = this.income + money;
	}

	public void showInfo() {
		System.out.printf("%s 택시는 %d의 수입이 있습니다.\n", this.TaxiNo, this.income);
	}
}