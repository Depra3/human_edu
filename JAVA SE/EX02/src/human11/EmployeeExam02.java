package human11;

public class EmployeeExam02 {

	public static void main(String[] args) {
		Employee02 p1 = new Employee02("강현준");
		Employee02 p2 = new Employee02("강우혁");
		Employee02 p3 = new Employee02("강주혁");
		
		p1.showInfo();	//강현준, 1001
		p2.showInfo();	//강우혁, 1002
		p3.showInfo();	//강주혁, 1003
	}

}
