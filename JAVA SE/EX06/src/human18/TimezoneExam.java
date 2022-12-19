package human18;

import java.util.TimeZone;

public class TimezoneExam {

	public static void main(String[] args) {
		String[] availavleIDs = TimeZone.getAvailableIDs();
		
		for (String a : availavleIDs) {
			System.out.println(a);
		}

	}

}
