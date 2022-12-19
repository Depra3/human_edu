package human06;

public class HumanExam01 {

	public static void main(String[] args) {
		// 반복해서 같은 일을 하는 것은 함수로 만들어서 호출하여 사용한다.
		// return이 없는 void 타입의 사례
		printTest();		//함수를 만들어 놓으면 여러번 호출해서 사용할 수 있다.
		System.out.println("---------------");
		
		printTest();
		System.out.println("---------------");
		
		printTest();
		System.out.println("---------------");
		
		printTest();
		System.out.println("---------------");
		printTest("강현준");
		printTest("강우혁");
		printTest("강주혁");
		
		printTest("강현준", 47);
		printTest(10,20);
		System.out.println("---------------");
		
		// return이 있는 사례
		// return의 값의 타입과 함수에서 되돌림에 대한 값의 타입은 일치해야 함.(int/double)
		int x1, x2, x3;
		double x4;
		x1 = add(10,20);
		System.out.printf("x1 = %d \n", x1);
		x2 = add(20,20);
		System.out.printf("x2 = %d \n", x2);
		x3 = add(10, 20, 30);
		System.out.printf("x3 = %d \n", x3);
		x4 = add(10, 20, 30.5);
		System.out.printf("x4 = %4.1f \n", x4);
	}

	private static double add(int i, int j, double d) {
		double z = i + j + d;
		return z;
	}

	private static int add(int i, int j, int k) {
		int z = i + j + k;
		return z;
	}

	private static int add(int i, int j) {
		int z = i + j;
		return z;
	}

	private static void printTest() {
		System.out.println("print 함수 TEST1");
		System.out.println("print 함수 TEST2");
		System.out.println("print 함수 TEST3");
		System.out.println("print 함수 TEST4");
//		return;		//void는 생략이 가능함.
	}
	
	private static void printTest(String name) {	//String name = "강현준"
		System.out.printf("제 이름은 %s입니다.\n", name);
	}
	
	private static void printTest(String name, int age) {
		System.out.printf("제 이름은 %s이고, 나이는 %d입니다. \n", name, age);
	}
	
	private static void printTest(int x1, int x2) {
		System.out.printf("(%d, %d) ==> %d \n", x1, x2, x1+x2);	
	}

}
