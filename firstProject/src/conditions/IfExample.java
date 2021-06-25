package conditions;

public class IfExample {
	public static void main(String[] args) {
		// System.out.println((int)(Math.random()*6)+1);
		int ran = (int) (Math.random() * 6) + 1;
		// ran = random
		// 1부터 6까지 범위의 임의의 값 출력.
		// 0이 안나오도록 +1 해준것임.
		// int는 정수만 출력하도록.
		// +1 없으면 0-5까지의 값 출력.

		if (ran == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (ran == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (ran == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (ran == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (ran == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (ran == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		int score = (int) (Math.random() * 100) + 1;
		System.out.println(score + "점수");
		if (score >= 90) {
			//90 이상 A학점부분...
			if (score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		}

		else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
		System.out.println("--------------------");
	}
}
