package human18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String str1 = sdf1.format(now);
		System.out.println(str1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String str2 = sdf2.format(now);
		System.out.println(str2);

	}

}
