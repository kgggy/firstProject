package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");

			int menu = scn.nextInt();
			// 사용자가 숫자를 넣으면 그 숫자를 읽어와 반환해줌.
			// 사용자가 숫자 입력하면 menu에 담김
			if (menu == 1) {
				System.out.println("예금처리.");
				System.out.println("금액을 입력하세요.");
				int temp = scn.nextInt();
				// 잔고가 10만원을 넘어서면 안됨.
				if(balance + temp >100000) {
					System.out.println("처리할 수 없는 금액입니다.");
				}else {
					System.out.println(temp + "원이 입금되었습니다.");
					balance = balance + temp;
					System.out.println("잔액은 " + balance + "원 입니다.");
				}
				
			} else if (menu == 2) {
				System.out.println("출금처리.");
				System.out.println("금액을 입력하세요.");
				int temp = scn.nextInt();
				//잔액보다 큰 금액 출금시 안된다고 메세지.
				if(balance < temp) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println(temp + "원이 출금되었습니다.");
					balance = balance - temp;
					System.out.println("잔액은 " + balance + "원 입니다.");
				}
				
			} else if (menu == 3) {
				System.out.println("잔액조회처리.");
				System.out.println("잔액은 " + balance + "원 입니다.");
				
			} else if (menu == 4) {
				break;
			}
		} // while
		System.out.println("프로그램을 종료합니다.");
	}// main()
}// class