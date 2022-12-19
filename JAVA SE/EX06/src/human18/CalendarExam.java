package human18;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		System.out.println(now.toString());
		
		int year = now.get(Calendar.YEAR);			// 2022
		int month = now.get(Calendar.MONTH) + 1;	// Calendar.MONTH는 0에서부터 시작 ==> 9
		int day = now.get(Calendar.DAY_OF_MONTH);	// 21
		int week = now.get(Calendar.DAY_OF_WEEK);	// 주 중의 몇번째 일자.
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:		// Calendar.MONDAY 는 2란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "월";
			break;
		case Calendar.TUESDAY:		// Calendar.TUESDAY 는 3이란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:	// Calendar.WEDNESDAY 는 4란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "수";
			break;
		case Calendar.THURSDAY:		// Calendar.THURSDAY 는 5란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "목";
			break;
		case Calendar.FRIDAY:		// Calendar.FRIDAY 는 6이란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "금";
			break;
		case Calendar.SATURDAY:		// Calendar.SATURDAY 는 7이란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "토";
			break;
		case Calendar.SUNDAY:		// Calendar.SUNDAY 는 1이란 수치를 static final로 Calendar 클래스에서 정의함.
			strWeek = "일";
			break;
		}
		
		String strAmPm = null;
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);		// 현재 시간
		int minute = now.get(Calendar.MINUTE);	// 현재 분
		int second = now.get(Calendar.SECOND);	// 현재 초
		
		System.out.printf("%d년도 %d월 %d일 %s요일 %s %d:%d:%d \n", year, month, day, strWeek, strAmPm, hour, minute, second);
	}
}
