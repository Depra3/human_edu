package human04_1;

public class MemberExam {

	public static void main(String[] args) {
		int[] score = { 10, 20, 30 };
		Member origin = new Member("Blue", "강현준", "12345", 47, true, score);
		
		Member cloned = origin.getMember();
		
		cloned.password = "67890";
		cloned.score[0] = 100;
		
		System.out.println(origin.password);
		System.out.println(cloned.password);
		// 기본형 변수들은 바꿔도 원본은 달라지지 않음.
		System.out.println(origin.score[0]);
		System.out.println(cloned.score[0]);
		// 같은 주소 값을 참조하고 있어서 
		// 복제된 객체에서 바꾸면 따라 바뀜.
		// 얕은복제 ┛

	}

}
