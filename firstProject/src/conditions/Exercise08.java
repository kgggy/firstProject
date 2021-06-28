package conditions;

import java.util.Scanner;

public class Exercise08 {

	// 필드 영역으로
	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	//boolean타입으로 반환하겠다는 의미.(return구문이 있다는 의미)
	public static boolean checkAdmin(String id, String pw) {
		if (id.equals("admin") && pw.equals("1234")) {
			return true;
		}
		return false;
	}
	
	//메소드 호출할 수 있도록 기능 구현
	// void = return값이 없을때 이용
	public static void printMenu() {
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔액 4.종료");
		System.out.println("-----------------------");
		System.out.println("선택> ");
	}

	public static void deposit() {
		System.out.println("금액을 입력하세요.");
		int temp = scn.nextInt();
		// 잔고가 10만원을 넘어서면 안됨.
		if (balance + temp > 100000) {
			System.out.println("처리할 수 없는 금액입니다.");
		} else {
			System.out.println(temp + "원이 입금되었습니다.");
			//balance = balance + temp;
			balance = add(balance, temp);
			System.out.println("잔액은 " + balance + "원 입니다.");
		}
	}

	public static void withdraw() {
		System.out.println("금액을 입력하세요.");
		int temp = scn.nextInt();
		// 잔액보다 큰 금액 출금시 안된다고 메세지.
		if (balance < temp) {
			System.out.println("잔액이 부족합니다.");
		} else {
			System.out.println(temp + "원이 출금되었습니다.");
			//balance = balance - temp;
			balance = add(balance, -temp);
			System.out.println("잔액은 " + balance + "원 입니다.");
		}

	}
	
	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}

	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.

		boolean run = false;

		do {
			if (!run) {
				// id, pw => admin, 1234가 들어오면 실행
				System.out.println("id를 입력하세요.");
				String id = scn.nextLine();
				System.out.println("pw를 입력하세요.");
				String pw = scn.nextLine();

				run = checkAdmin(id, pw);
			} else {

			// 메뉴를 출력.(메소드 호출)
			printMenu();

			int menu = scn.nextInt();
			// 사용자가 숫자를 넣으면 그 숫자를 읽어와 반환해줌.
			// 사용자가 숫자 입력하면 menu에 담김
			if (menu == 1) {
				System.out.println("예금처리.");
				deposit();

			} else if (menu == 2) {
				System.out.println("출금처리.");
				withdraw();

			} else if (menu == 3) {
				System.out.println("잔액조회처리.");
				System.out.println("잔액은 " + balance + "원 입니다.");

			} else if (menu == 4) {
				run = false;
			}
			}
		} while (run); // while
		System.out.println("프로그램을 종료합니다.");
	}// main()
}// class