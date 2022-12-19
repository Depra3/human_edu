package human20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExam {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.toString());

		String strDateTime = now.getYear() + "년 ";
		strDateTime = strDateTime + now.getMonthValue() + "월 ";
		strDateTime = strDateTime + now.getDayOfMonth() + "일 ";
		strDateTime = strDateTime + now.getDayOfWeek() + " ";
		strDateTime = strDateTime + now.getHour() + "시 ";
		strDateTime = strDateTime + now.getMinute() + "분 ";
		strDateTime = strDateTime + now.getSecond() + "초 ";
		strDateTime = strDateTime + now.getNano() + "나노초";
		System.out.println(strDateTime);

		LocalDate nowDate = now.toLocalDate();
		if (nowDate.isLeapYear()) {
			System.out.println("올해는 윤년 : 2월은 29일까지 있음.");
		} else {
			System.out.println("올해는 평년 : 2월은 28일까지 있음.");
		}

		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDateTime);
		// 기준이 되는 그리니치 항성시.

		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임존 : " + seoulDateTime);

		ZoneId seoulZondId = seoulDateTime.getZone();
		System.out.println("서울에 대한 Zone Id : " + seoulZondId);

		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울은 기준시(그리니치 항성시)로부터 얼마나 차이가 있는가? " + seoulZoneOffset + "시간");
	}

}
