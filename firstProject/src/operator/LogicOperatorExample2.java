package operator;

public class LogicOperatorExample2 {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 60 && score <= 69) {
			System.out.println('D');
		}else if(score >= 70 && score <= 79) {
			System.out.println('C');
		}else if(score >= 80 && score <= 89) {
			System.out.println('B');
		}else if(score >= 90 && score <= 100) {
			System.out.println('A');
		}else {
			System.out.println("Fail");
		}
	}

}
