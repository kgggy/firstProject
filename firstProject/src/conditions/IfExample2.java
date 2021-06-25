package conditions;

import java.util.Scanner;
//java.util에 있는 Scanner(Scanner의 풀네임)를 가져와서 쓰겠다는 의미

public class IfExample2 {
	public static void main(String[] args) {
		// 사용자의 입력값을 읽어들이는 클래스 Scanner
		Scanner scanner = new Scanner(System.in); //System.in : 키보드에서 입력하는 값을 읽어와서 그 값을 처리한다는 의미
		System.out.println("숫자 입력...");
		int val = scanner.nextInt(); 
		//사용자가 숫자를 입력하고 엔터치면 그 입력값을 val 안에 담겠다
		System.out.println("입력값: " + val);
		
		//홀수인지 짝수인지 구분하는 코드.
		if (val % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}// end of main()

}//end of class
