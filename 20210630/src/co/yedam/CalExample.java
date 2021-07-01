package co.yedam;

import java.util.Calendar;

public class CalExample {
	// 달력만들기
	public static void main(String[] args) {
		int year = 2021;
		int month = 7;
		printCal(year, month);
	}

	public static void printCal(int year, int month) {

		System.out.println(year + "년 " + month + "월 달력입니다.");

		// new Calendar();와 같은 말임
		Calendar cal = Calendar.getInstance(); // ctrl+shift+o => import해줌
		cal.set(year, month - 1, 1);

		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		printDays(); // 요일 타이틀 보여주기.

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + firstDay) % 7 == 1) {
				System.out.println();
			}
		}

//		System.out.println("( " + cal.get(Calendar.YEAR) + " )");
//		System.out.print((cal.get(Calendar.MONTH) + 1) + "월");
//		System.out.print(" " + cal.get(Calendar.DAY_OF_MONTH) + "일");
//		System.out.print(" " + cal.get(Calendar.DAY_OF_WEEK) + "요일");
//		System.out.println();
//		System.out.println("막날 : " + cal.getActualMaximum(Calendar.DATE));
//		System.out.println();
	}

	public static void printDays() {
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		// 요일정보 : 확장for(배열에 들어있는 갯수 만큼 반복문을 실행하시오)
		for (String day : days) {
			System.out.print(" " + day);
		}
		System.out.println();
	}// end of printDays
}
