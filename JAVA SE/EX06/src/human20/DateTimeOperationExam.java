package human20;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationExam {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시간 : " + now.toString());

		// 날짜, 시간의 연산
		LocalDateTime targetDateTime1 = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6);
		System.out.println("타겟 시간1 : " + targetDateTime1.toString());

		// 날짜, 시간의 직접 변경
		LocalDateTime targetDateTime2 = now.withYear(2024).withMonth(8).withDayOfMonth(20).withHour(11);
		System.out.println("타겟 시간2 : " + targetDateTime2.toString());

		// 각 날짜의 특징에 따른 날짜 시간 구해오기
		LocalDateTime targetDateTime3 = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해의 첫날은 ? " + targetDateTime3);
		LocalDateTime targetDateTime4 = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막날은 ? " + targetDateTime4);
		LocalDateTime targetDateTime5 = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("내년의 첫날은 ? " + targetDateTime5);
		
		LocalDateTime targetDateTime6 = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫날은 ? "+ targetDateTime6);
		LocalDateTime targetDateTime7 = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막날은 ? "+ targetDateTime7);
		LocalDateTime targetDateTime8 = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫날은 ? "+ targetDateTime8);
		
		LocalDateTime targetDateTime9 = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일은 ? "+ targetDateTime9);
		LocalDateTime targetDateTime10 = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("현재 시간 대비 다음주 월요일의 날짜는? "+ targetDateTime10);
		LocalDateTime targetDateTime11 = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("현재 시간 대비 지난주 월요일의 날짜는? "+ targetDateTime11);
	}
}
