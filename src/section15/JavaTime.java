package section15;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
 * java.time 패키지
 * 	날짜 시간 관련 패키지
 * 	JDK8 이상 사용가능하다.
 * 
 */
public class JavaTime {
	public static void main(String[] args) {
		
		// 현재 날짜와 시간 가져오기
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("current Date and Time: "+ currentDateTime);
		
		// 날짜와 시간 분리
		LocalDate currentDate = currentDateTime.toLocalDate();
		LocalTime currentTime = currentDateTime.toLocalTime();
		System.out.println("currentDate: " + currentDate);
		System.out.println("currentTime: " + currentTime);
		
		// 특정 나짜와 시간 생성
		LocalDateTime specificDateTime = LocalDateTime.of(2023, Month.JANUARY, 1, 12, 0);
		System.out.println("specific Date and Time: " + specificDateTime);
		
		// 날짜 연산 (일주일 후)
		LocalDateTime oneWeekLater = currentDateTime.plusWeeks(1);
		System.out.println("One Week Later: " + oneWeekLater);
		
		// 날짜를 형식에 맞게 포멧팅
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		String formattedDate = currentDateTime.format(dateFormatter);
		System.out.println("formatted Date: " + formattedDate);
		
		// 문자열을 날짜로 파싱
		String dateString = "2023.09.01";
		LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
		System.out.println("Parsed Date: " + parsedDate);
		
		// 기본 시스템 타임존 가져오기
		ZoneId systemZone  = ZoneId.systemDefault();
		System.out.println("system time Zone: " + systemZone);
		
		// 특정 타임존으로 날짜와 시간 설정
		ZoneId newYorkZone = ZoneId.of("America/New_York");
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYorkZone);
		System.out.println("newYork Date and Time: " + newYorkZone);
		
		// 현재 UTC 시간 가져오기
		Instant currentUTC = Instant.now();
		System.out.println("currentUTC time: " + currentUTC);
				
				
	}

}
