package referece;

public class ArrayExample6 {
	public static void main(String[] args) {
		// 학생의 점수 담는 배열을 선언. scores
		// 평균점수와 가장 높은 점수를 구함.
		int[] scores = { 50, 50, 47 }; //선언하면서 초기값도 준 경우
									  //선언만 한 경우 new int[3] => {0,0,0}
		scores = new int[10];

		double avg = 0.0;
		int maxValue = 0;
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {
			scores[i] = (int) (Math.random() * 50) + 51;//51부터 시작해서 50(0-49)개.
			sum = sum + scores[i];
			//avg = sum / 3.0;
			System.out.println(i + " ,"+ scores[i]);
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			} 
		}avg = (double) sum / scores.length;				
		
		
		System.out.println("평균은 " + avg);
		System.out.println("최고점수는 " + maxValue);
	}
}

