package operator;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		val1++;
		val1 = val1 + 2;
		val1 += 2;
		//7, 8행은 같은 내용임(val1에 2를 더해서 출력)
		val1--;
		val1 = val1 -3;
		val1 -= 3;
		
		val1 = val1 * 2;
		val1 *= 2;
		
		System.out.println(val1);
		
		String str1 = "A";
		str1 = str1 + "B";
		str1 += "C";
		//문자일 경우 +는 붙여주는 역할
		System.out.println(str1);
		
		String msg = "";
		if(val1 % 2 == 0) {
			msg = "짝수";
		}else {
			msg = "홀수";
		}
	System.out.println(val1 + "은" + msg + "입니다.");
	
	msg = (val1 % 2==0) ? "짝수" : "홀수";
	System.out.println(val1 + "은" + msg + "입니다.");
	//25-31 if else구문을 한 라인으로 표현한 것.
	//()는 조건, 참이면 짝수, 거짓이면 콜론 뒤의 홀수를 출력.(조건이 두개일 경우 사용)
	}

}
