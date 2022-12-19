package human11;

public class EmployeeExam01 {

	public static void main(String[] args) {
		Employee01 p1 = new Employee01("강현준");
		Employee01 p2 = new Employee01("강우혁");
		Employee01 p3 = new Employee01("강주혁");
		
		p1.showInfo();	//강현준, 1001
		p2.showInfo();	//강우혁, 1001
		p3.showInfo();	//강주혁, 1001
	}

}
