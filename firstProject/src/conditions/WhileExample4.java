package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		// ForExample3.java의 내용을 while 구문으로 사용.
		// 1~50까지 2 또는 3의 배수의 합을 구하시오.
		int i = 1;
		int sum = 0;
		while (i <= 50) {

			if (i % 2 == 0 || i % 3 == 0) {
				sum = sum + i;
			}
				i++;
		}

		System.out.println("총 합계 : " + sum);

	}
}

