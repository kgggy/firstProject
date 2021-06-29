package referece;

import java.util.Scanner;

public class ArrayExample4 {
	
	//main, show 두개의 메소드 모두에서 쓸 수 있도록 메소드 밖에 선언.
	static int n = 25;
	static int[] intAry = new int[n];
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //사용자 입력값 받아오기
		
		// 중복값 제거.
		
		for (int i = 0; i < intAry.length; i++) {
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;
			// 이전값과 비교.
			for (int j = 0; j < i; j++) {
				System.out.print(intAry[j] + "\t");
				if (intAry[i] == intAry[j]) {
					pass = false; // 같으면 이미 실패로 반복문 빠져나오기
					break; // 동일한 값이 있으면 for 반복문 벗어나기.
				}
			}
			if (!pass) {
				i--; // 첫번째 for 구문에서 i를 다시 더해주기때문에 빼줌
			}
			System.out.println("i : " + i + " : end");
		}
//		int n = 3;
//		System.out.println(intAry[n]);
//		System.out.println(intAry[n-1]); //배열상 2의 자리(3번째숫자)
//		
		// 배열의 각 값을 출력.
//		intAry[0] = 0;  // 0번째 자리가 **로 표시됨
//		intAry[4] = -1; 
		
		//가장 처음에 화면에 출력되는 내용
		for (int i = 0; i < intAry.length; i++) {
			show(i);
			if (i % 5 == 4) {
				System.out.println(); //다섯개씩 줄 바꾸기
			}
		}
		
		while(true) {
			System.out.println("숫자 10을 찾으세요(0~24)...");
			int idx = scn.nextInt();
			
			//잘못된 범위의 값을 입력했을 시
			if(idx > 24 || idx <0) {
				System.out.println("잘못된 값입니다.");
				continue; //반복문을 빠져나오는 것 = break
				// 아래 부분을 실행하지 않고 다시 반복의 처음으로 감(빠져나오지 않음) = continue
			}
			if(intAry[idx] == 10) {
				System.out.println("찾았습니다.");
				break;
			}
		else {
				intAry[idx] = 0;
				System.out.println("");
			}
			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) {
					System.out.println(); //다섯개씩 줄 바꾸기
				}
			}
		} System.out.println("프로그램이 종료되었습니다.");
		
//		

//		int num1 = (int) (Math.random() * 5); 
//		int num2 = (int) (Math.random() * 5); 
//		while(true) {
//			if(num1 == num2) {
//				num2 = (int) (Math.random() * 5);
//			}else {
//				break;
//			}
//		}
//		
//		int num3 = (int) (Math.random() * 5); 
//		while(true) {
//		if(num1 == num3 || num2 == num3) {
//			num3 = (int) (Math.random() * 5);
//		}else {
//			break;
//		}
//		}
//		
//		int num4 = (int) (Math.random() * 5); 
//		while(true) {
//			if(num1 == num4 || num2 == num4 || num3 == num4) {
//				num4 = (int) (Math.random() * 5);
//			}	else {
//				break;
//			}
//		}
//		
//		int num5 = (int) (Math.random() * 5); 
//		while(true) {
//			if(num1 == num5 || num2 == num5 || num3 == num5 || num4 == num5) {
//				num5 = (int) (Math.random() * 5);
//			}else {
//				break;
//			}
//		}
//		
//		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
	}//end of main
	
	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx+1); 
		} else {
			System.out.printf("(**)", idx+1); 
		}
		
	}

}
