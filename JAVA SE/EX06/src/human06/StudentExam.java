package human06;

import java.util.Objects;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(101);
		Student s2 = new Student(102);
		Student s3 = new Student(103);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		
		System.out.println(result);
	}

}
