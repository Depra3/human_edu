package human04_2;

public class MemberExam {

	public static void main(String[] args) {
		int[] score = { 10, 20, 30 };
		Car car1 = new Car("소나타", 100);
		Member origin = new Member("Blue", "강현준", "12345", 47, true, score, car1);

		Member cloned = origin.getMember();
		
		cloned.password = "67890";
		cloned.score[0] = 100;
		cloned.car.model = "그랜져";
		
		System.out.println(origin.password);
		System.out.println(cloned.password);
		
		System.out.println(origin.score[0]);
		System.out.println(cloned.score[0]);
		
		System.out.println(origin.car.model);
		System.out.println(cloned.car.model);
	}

}
