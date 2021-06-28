package conditions;

public class ForExample4 {

	public static void main(String[] args) {
	whileSum();
	forSum();
	}

	public static void whileSum() {
		// 1~10까지 짝수 합 : 55 의 형태로 출력
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if ( i % 2 == 0) {
				sum = sum + i;
			}
			i++;//if 블록 밖으로 빼줘야함
		} System.out.println("1부터 10까지의 짝수의 합 : " + sum );
	}

	public static void forSum() {
			//1부터 10까지 i 변수를 활용.
			//int sum = 0;
			//1~10까지 합 : 55 의 형태로 출력
//			int sum = 0;
//			for(int i = 1 ; i <=10 ; i++) {
//				sum = sum + i;
//			}System.out.println("1~10 까지의 합 : " + sum);
			
			//1 부터 10까지 홀수의 합
			int sum = 0;
			for ( int i = 1 ; i <= 10 ; i++) {
				if (i % 2 == 1) {
					sum = sum + i;
					System.out.println("sum> " + sum + ", i> " + i);
				}
			}System.out.println("1부터 10 까지의 홀수 합 : " + sum);
		}
}
