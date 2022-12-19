package human12;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExam {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println("------------------");

		Properties props = System.getProperties();	//	*
		Set keys = props.keySet();					//	*
		for (Object objkey : keys) {
			String key = (String) objkey; // 강제타입변환
			String value = System.getProperty(key);
			System.out.println(key + " - " + value);
		}
	}

}
