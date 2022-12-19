package human20;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExam {
	public static void main(String[] args) throws InterruptedException {
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currDate);
		LocalDate targetDate = LocalDate.of(2023, 1, 1);
		System.out.println("목표 날짜 : " + targetDate);

		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : " + currTime);
		LocalTime targetTime = LocalTime.of(13, 58, 59);
		System.out.println("목표 시간 : " + targetTime);

		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + currDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2023, 1, 1, 13, 58, 59);
		System.out.println("목표 날짜와 시간 : " + targetDateTime);

		ZonedDateTime utcDateTime = ZonedDateTime.now(); // 한국시간
		System.out.println("현재 날짜와 시간 : " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 날짜와 시간 : " + newyorkDateTime);

		Instant i1 = Instant.now();
		Thread.sleep(1000);			// 1초 기다렸다가 수행.
		Instant i2 = Instant.now();
		
		if(i1.isBefore(i2)) {
			System.out.println("Instant1이 instant2보다 빠릅니다.");
		} 
		else if(i1.isAfter(i2)) {
			System.out.println("Instant1이 instant2보다 늦습니다.");
		} 
		else {
			System.out.println("Instant1은 instant2와 같습니다.");
		}
//		System.out.println("차이 : "+ i1.until(i2, ChronoUnit.NANOS));	// 나노초
		System.out.println("차이 : "+ i1.until(i2, ChronoUnit.SECONDS));	// 초
	}
}
