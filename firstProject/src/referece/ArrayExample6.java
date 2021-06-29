package referece;

public class ArrayExample6 {
	public static void main(String[] args) {
		// 학생의 점수 담는 배열을 선언. scores
		// 평균점수와 가장 높은 점수를 구함.
		int[] scores = { 50, 50, 47 };

		double avg = 0.0;
		int maxValue = 0;
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {
			scores[i] = (int) (Math.random() * 50) + 51;
			sum = sum + scores[i];
			avg = sum / 3.0;
			System.out.println(i + " ,"+ scores[i]);
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			} 
		}
		
		System.out.println("평균은 " + avg);
		System.out.println("최고점수는 " + maxValue);
	}

}
