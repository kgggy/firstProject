package co.yedam.api;

import java.text.DecimalFormat;
import java.text.MessageFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.TimeZone;

//import java.util.Random;

public class TimeZoneExample {
	public static void main(String[] args) {
////		for (int i = 0; i < 3; i++) {
////			System.out.println(new Random().nextInt(10)); //10범위 안의 난수를 만듦.
////		}
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/E a HH시 mm분 ss초");
//		Date now = new Date();
//		System.out.println(sdf.format(now));
//
////		String[] timezones = TimeZone.getAvailableIDs();
////		for (String timezone : timezones) {
////			if(timezone.toLowerCase().indexOf("seoul") != -1) //모두 소문자로 변경하여 그 중 찾는 값이 없으면 -1을 리턴해줌.
////			System.out.println(timezone);
////		}
//
//		Calendar today = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
//		System.out.println(today.get(Calendar.DATE) + "일 " + today.get(Calendar.HOUR) + "시 "
//				+ today.get(Calendar.MINUTE) + "분 " + today.get(Calendar.AM_PM));

//		DecimalFormat df = new DecimalFormat("￦ #,###.###");
//		df = new DecimalFormat("0000000000.0000");
//		df = new DecimalFormat("##########.####");
//		double num = 123456.789;
//
//		System.out.println(df.format(num));

		String data = "회원ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		System.out.println(MessageFormat.format(data, "123", "홍길동", "1234-5678"));

		System.out.format("회원ID: %s \n회원 이름: %s \n회원 전화: %s", "123", "홍길동", "1234-5678");
	}
}
