package operator;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 95;
		// 60점보다 크면 console "합격입니다.";
		// 60보다 작으면 console "불합격입니다.";

		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("___________");
		// 90 이상 A
		// 80 이상 B
		// 70 이상 C
		// 60 이상 D
		// 이하 F

		if (score >= 90) {
			if(score>=95) {
				System.out.println("A+학점");
			}else {
			System.out.println("A학점");
			}
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}//end of main()
}//end of class
