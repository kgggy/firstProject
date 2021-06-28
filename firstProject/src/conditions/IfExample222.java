package conditions;

import java.util.Scanner;

public class IfExample222 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 풀네임 써줘야 함-> import 사용
		//사용자의 입력값 읽어옴, System.in:키보드입력
		System.out.println("숫자입력..");
		int val = scanner.nextInt();
		System.out.println("입력값 : "+ val);
		
		if (val % 2 == 0) {
			System.out.println("짝수입니댜.");
		}
		else {
			System.out.println("홀수입니댜.");
		}
		
		System.out.println("-------------");
		
		String msg ="";
		if (val % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}
		System.out.println(val +"은 "+ msg +"입니다.");
		
		System.out.println("-------------");
		
		msg = (val % 2 == 0) ? "짝수" : "홀수";
		System.out.println(val +"은 "+ msg +"입니다.");
		
	}
}


//String msg = "";
//if (val1 % 2 == 0) {
//	msg = "짝수";
//} else {
//	msg = "홀수";
//}
//System.out.println(val1 +"은 "+ msg +"입니다.");
//
//msg = (val1 % 2 == 0) ? "짝수" : "홀수";
//System.out.println(val1 +"은 "+ msg +"입니다.");


