package conditions;

public class ForExample {
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("안녕하세요.");
//		} // 초기값; 조건식(참이면 바로 출력, 거짓이면 다음단계로) ;증감치
//		System.out.println("반복문 종료.");

		// 1~10의 합을 구하는 프로그램.
		// 1~10 사이의 홀수의 합을 구하는 프로그램.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {

				System.out.println("현재 i : " + i);
				sum = sum + i;
				System.out.println("현재 sum : " + sum);
				try {
					Thread.sleep(500); // 0.5초 기다린다는 뜻
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}else if (i == 5 ) {
				break; 
		} 
		}System.out.println("최종 합계 = " + sum);
	}
}