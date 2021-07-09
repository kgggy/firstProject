package co.yedam.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); // LocalDateTime 포멧을 String타입으로.//format 

		LocalDateTime anytime = LocalDateTime.parse("2021-06-13 15:00:00", dtf); // parse => String->LocalDateTime(문자열을 데이터포멧양식으로 이해하는것)
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");
		LocalDateTime.parse("2021/05/01 14", dtf);

		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		System.out.println(anytime.getYear()); //anytime기준의 year정보.
		System.out.println(anytime.getMonthValue() + "월");
		System.out.println(anytime.getMonth());
		LocalDateTime ti = LocalDateTime.now().withYear(2020).withMonth(7).withDayOfMonth(5).withHour(15).withMinute(30).withSecond(25); 
		//with => 시간을 새롭게 지정.
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		
		LocalDateTime yourBirth = LocalDateTime.now().withYear(1997).withMonth(6).withDayOfMonth(10).withHour(22).withMinute(30).withSecond(24);
		System.out.println(yourBirth.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss 출생")));
	}

}
