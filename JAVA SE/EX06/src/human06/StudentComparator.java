package human06;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		if (s1.sNo < s2.sNo) {
			return -1;
		} else if(s1.sNo==s2.sNo) {
			return 0;
		} else {
			return 1;
		}
	}

}
