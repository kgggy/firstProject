package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// 임의의 수 => 가위, 바위, 보
		int ran = (int) (Math.random() * 3);

		Scanner scn = new Scanner(System.in);
		System.out.println("가위, 바위, 보!!@!!");
		String str = scn.nextLine();

		String rsp = "";
		if (ran == 0) {
			rsp = "가위";
		} else if (ran == 1) {
			rsp = "바위";
		} else if (ran == 2) {
			rsp = "보";
		}
		System.out.println(rsp);

		// 조건문... 컴퓨터 랜덤 가위바위보 vs 입력하는 가위바위보

		if (ran == 0 && str.equals("가위")|| ran == 1 && str.equals("바위") || ran == 2 && str.equals("보")) {
			System.out.println("same");
		} else if (ran == 0 && str.equals("바위") || ran == 1 && str.equals("보") || ran == 2 && str.equals("가위")) {
			System.out.println("you win!!");
		} else if (ran == 0 && str.equals("보") || ran == 1 && str.equals("가위") || ran == 2 && str.equals("바위")) {
			System.out.println("you lose...");
		}

	}

}
