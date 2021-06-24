package operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int val1 = 6;
		
		if(val1 % 2 == 0 && val1 % 3 ==0) {
			System.out.println("2와 3의 배수입니다.");
		}else if(val1 % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else if(val1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		// &&조건 두개 모두 만족
		// ||조건 둘 중 하나 만족
		// 순차적으로 검사하므로 우선 걸러내고싶은 조건을 먼저 작성
		
		if( val1 % 2 == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}
}
