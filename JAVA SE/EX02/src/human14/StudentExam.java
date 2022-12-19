package human14;

public class StudentExam {

	public static void main(String[] args) {
//		Student s1 =new Student();
//		Student s2 =new Student();
//		
//		System.out.println(s1);
//		System.out.println(s2); 
		//2개의 주소가 다름
		Student s1 = Student.getInstance();
		System.out.println(s1);
		Student s2 = Student.getInstance();
		System.out.println(s2);
		//2개의 주소가 당연히 같음.
		
		int a= 10;	//메모리 하나
		System.out.println(a);	//10
		
		a = 20;
		System.out.println(a);	//20
		
		a = 30;
		System.out.println(a);	//30

	}

}
