package co.friend.common;

import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {
	static Scanner scn = new Scanner(System.in); // static내에서 쓰려면 똑같이 붙여야함.

	// 사용자의 입력을 유도하는 메세지 -> 숫자, 문자
	// static => 인스턴스 만들 필요 없이 (클래스명.메소드) 형태로 만들 수 있음
	public static int readInt(String prompt) {
		System.out.println(prompt);
		int menu = readInt();
		return menu;
		// return readInt();
	}

	// 숫자 리턴.
	public static int readInt() {
		int val = 0;
		while (true) {
			try {
				val = scn.nextInt(); 
				scn.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return val;

	}

//문자 리턴.
	public static String readString(String prompt) {
		System.out.println(prompt);
		return readString();
	}

	public static String readString() {
		String msg = null;
		try {
			msg = scn.nextLine();
			return msg;
		} catch (Exception e) {
			System.out.println("관리자에게 문의하세요.");
		}
		return msg;
	}

	public static Friend readFriend() {
		System.out.print("구분,이름,전화 ");
		String input = scn.next();
		String[] inputs = input.split(","); // ,로 구분되는 배열을 만들어줌
		return new Friend(inputs[0], inputs[1], inputs[2]);
	}
}
