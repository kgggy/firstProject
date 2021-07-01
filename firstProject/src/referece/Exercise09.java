package referece;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		int maxValue = 0;
		double avg = 0.0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택 >");

			int selectNo = scanner.nextInt();

			if (selectNo == 2 || selectNo == 3 ||selectNo == 4 || selectNo == 5)   {
				System.out.println("처리할 수 없습니다.");
				if (selectNo == 1) {
					System.out.println("학생수 > ");
					studentNum = scanner.nextInt();
					scores = new int[studentNum];
				} 

			} else if (selectNo > 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + ">");
					scores[i] = scanner.nextInt();
					if (100 < scores[i]) {
						System.out.println("잘못된 값입니다.");
						i--;
					} else {
						continue;
					}
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					avg = sum / 3.0;
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}
				System.out.println("최고 점수: " + maxValue);
				System.out.println("평균 점수: " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

//	public static boolean returnM() {
//		System.out.println("메뉴로 돌아가시겠습니까?(Y, N)");
//		String yorn = scanner.nextLine();
//		if(yorn.equals("Y")) {
//			return true;
//		}else {
//			return false;
//		}
//	}

}
