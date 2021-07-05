package co.yedam.Account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

	// 사용자가 입력한 값을 문자열로 반환.
	public static String scanString(String arg) {// static => 메모리에 바로 준비되도록 해줌 => new로 인스턴스 안만들어줘도됨.
		System.out.println(arg);
		String val = scn.nextLine();
		return val;
	}

	public static String scanNumberString(String arg) {
		String val = "";
		while (true) {
			System.out.println(arg);
			val = scn.nextLine();
			try {
				Integer.parseInt(val); // (숫자 타입으로) 맞게 입력했을 시
				break;
			} catch (Exception e) { //에러발생시
				System.out.println("숫자를 입력하세요.");
			}
		}
		return val;
	}
}
