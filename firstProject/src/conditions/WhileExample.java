package conditions;

public class WhileExample {
	public static void main(String[] args) {
		// 초기값, 조건식, 증감식 : for (int i=0; i<5; i++) {실행문... }
		//while(조건식) 조건식이 참일동안 반복
		int i=0;
		while(i<5) {
			System.out.println("안녕하세요.");
			i++;
			//증감식이 있어야 무한루프에서 빠져나올 수 있음
		} System.out.println("프로그램을 종료.");
	}

}
