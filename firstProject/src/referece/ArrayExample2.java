package referece;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 33, 56, 17 }; // 정수 타입의 배열(int), intAry는 변수로 이름 맘대로 지정ㅇ
		System.out.println("배열크기 : " + intAry.length);
		System.out.println(intAry[0]);// 번지로 해당하는 값 불러오기
		intAry[0] = 11;// 변수처럼 값 지정할 수도 있음
		intAry[4] = 22;

		int sum = 0;
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값 : " + intAry[i]);
			sum = sum + intAry[i];

			// 배열의 값 중에서 가장 큰 값 maxValue에 담기
			if (intAry[i] > maxValue) {
				maxValue = intAry[i]; //i를 maxValue에 담는것!! 순서 주의
			}
		}
			System.out.println("합계 : " + sum);
			System.out.println("가장 큰 값 : " + maxValue);

//		double[] dblAry = {1.0, 2.0, 3.0 };
//		String[] names = {"Hong", "Kim", "Kwon" };
//		names[0] = "Hwang";
//		
//		//향상된 for문.
//		for(String n : names) {   //names에 담긴 배열을 가지고옴
//			System.out.println(n);
//		}
//		
//		for(double num : dblAry) {
//			System.out.println(num);
//		}
		}

	}