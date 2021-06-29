package referece;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		// "Hong" Enter => "첫번째 위치에 있습니다." 메시지 뿌리기
		// quit Enter => 프로그램 종료.
		// "Lee" Enter => 이런 이름은 없습니다.
		Scanner scn = new Scanner(System.in);

		String[] names = new String[5];
		names[0] = "Hong"; // 첫번째.
		names[1] = "Park"; // 두번째.
		names[2] = "Kim";
		names[3] = "Choi";
		names[4] = "Kwon";

		String[] num = new String[5];
		num[0] = "첫번째";
		num[1] = "두번째";
		num[2] = "세번째";
		num[3] = "네번째";
		num[4] = "다섯번째";

		while (true) {
			System.out.println("이름을 입력하세요.");
			boolean pass = false;
			String input = scn.nextLine();
			if (input.equals("quit")) {
				break;
			}
			for (int i = 0; i < names.length; i++) {
				if (input.equals(names[i])) {
					System.out.println(num[i] + "입니다.");
					pass = true;
				}
			}
			if (!pass) {
				System.out.println("같은 이름은 없습니다.");
			}
		}

//		while(true) {
//			System.out.println("이름을 입력하세요.");
//	  String input = scn.nextLine();
//			if(input.equals("quit")) {
//				break;
//		} else if(input.equals(names[0])) {
//			System.out.println(num[0]);
//		}else if(input.equals(names[1])) {
//			System.out.println(num[1]);
//		}else if(input.equals(names[2])) {
//			System.out.println(num[2]);
//		}else if(input.equals(names[3])) {
//			System.out.println(num[3]);
//		}else if(input.equals(names[4])) {
//			System.out.println(num[4]);
//		}else {
//			System.out.println("이름이 없습니다.");
//		}
//		}

//		while(true) {
//			System.out.println("이름을 입력하세요.");
//			String input = scn.nextLine();
//			if(input.equals("quit")) {
//				break;
//			} else if(input.equals(names[0])) {
//				System.out.println("첫번째 위치에 있습니다.");
//			}else if(input.equals(names[1])) {
//				System.out.println("두번째 위치에 있습니다.");
//			}else if(input.equals(names[2])) {
//				System.out.println("세번째 위치에 있습니다.");
//			}else if(input.equals(names[3])) {
//				System.out.println("네번째 위치에 있습니다.");
//			}else if(input.equals(names[4])) {
//				System.out.println("다섯번째 위치에 있습니다.");
//			}else {
//				System.out.println("이런 이름은 없습니다.");
//			}
//			
//		}

	}

}
