package human11;

public class Employee01 {
	public String name;
	public int employeeID;
	public int serialNum = 1000;

	public Employee01(String name) {
		this.name = name;
		this.serialNum = this.serialNum + 1;
		this.employeeID = this.serialNum;
	}

	public void showInfo() {
		System.out.printf("%s 사원의 사번은 %d입니다. \n", this.name, this.employeeID);
	}

}
