package conditions;

import java.util.Scanner;
//Scanner 클래스 이용시 적어줘야함.

public class IfExample3 {
	public static void main(String[] args) {
		// 임의의 수 1,2,3을 생성.(변수 1)
		// 사용자에게 값을 입력하도록 메시지, 2 입력.(변수 2)
		// 임의의 수와 사용자 값을 비교(변수 1, 2 비교)
		// 같으면 정답입니다. 다르면 틀렸습니다. 메시지 뿌리기

//		int ran = (int) (Math.random() * 3) + 1;
//		System.out.println(ran);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("값을 입력하세요.");
//		int val = scanner.nextInt();
//		//System.out.println("정답은 :" + ran);
//		if (ran == val) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.println("틀렸습니다.");
//
//		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름 입력하세요.");
//		String name = scanner.nextLine();
//		System.out.println("이름은 : " + name);
		// 문자를 입력하고 싶을땐 nextLine 이용

		
		// 임의의 수 1:가위, 2:바위, 3보
		Scanner scanner = new Scanner(System.in);
		int ran = (int) (Math.random() * 3) + 1;
		System.out.println(ran);
		System.out.println("가위바위보!");

		String name = scanner.nextLine();
		String anyval = "";

		if (ran == 1) {
			anyval = "가위";
		} else if (ran == 2) {
			anyval = "바위";
		} else if (ran == 3) {
			anyval = "보";
		} // 1이면 가위, 2면 바위, 3이면 보 

		if (anyval.equals(name)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		} // ex. 1이 출력되고 가위를 입력하면 "같습니다"

	}// end of main()

}// end of class