package conditions;

public class ForExample3 {
	public static void main(String[] args) {
		// 1~50까지 수 중에서 2 또는 3의 배수의 합.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
				sum = sum + i;
				System.out.println("합계 = " + sum);
				try {
					Thread.sleep(500); // 0.5초 기다린다는 뜻
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}System.out.println("총 합계 : " + sum);

	}

}
