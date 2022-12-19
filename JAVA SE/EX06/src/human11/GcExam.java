package human11;

public class GcExam {

	public static void main(String[] args) {
		Employee emp;
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp : " + emp.eNo);
		System.gc();
		// System.gc()호출시키면 finalize가 동작함.
	}

}
