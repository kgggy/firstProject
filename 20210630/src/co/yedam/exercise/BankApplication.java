package co.yedam.exercise;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택 >>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				// withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}// end of main

	private static void createAccount() {
		System.out.println("=======");
		System.out.println("계좌생성");
		System.out.println("=======");

		String acc = scanString("계좌번호 : ");
		String name = scanString("계좌주 : ");
		int first = scanInt("초기입금액 : ");

		Account accounts = new Account(acc, name, first);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = accounts;
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("=======");
		System.out.println("계좌목록");
		System.out.println("=======");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].showInfo());
			}
		}
	}

//	private static Account findAccount(String ano) {
//		String acc = scanner.nextLine();
//		for (int i = 0; i < accountArray.length; i++) {
//			accountArray[i].getAno().equals(acc);
//		}
//		return ano;
//	}

	private static void deposit() {
		System.out.println("====");
		System.out.println("예금");
		System.out.println("====");

		String acc = scanString("계좌번호 >>");
		boolean exist = false;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(acc)) {
					System.out.println(accountArray[i].showInfo());
					exist = true;
				}
			}
		}
		if (!exist) {
			System.out.println("등록된 계좌가 없습니다.");
		}
	}
//	if (findAccount() != acc)) {
//		System.out.println("등록된 계좌가 없습니다.");
//		break;
//	} 
//		int saving = scanInt("예금액 >>");
//		System.out.println("결과: 예금이 성공되었습니다.");
//	}

	public static String scanString(String msg) {
		System.out.println(msg);
		String val = scanner.nextLine();
		return val;
	}
	public static int scanInt(String msg) {
		System.out.println(msg);
		int val = scanner.nextInt();
		return val;
	}

}// class
