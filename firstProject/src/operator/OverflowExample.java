package operator;

public class OverflowExample {
	public static void main(String[] args) {
		try {
		
		int r1 = add(Integer.MAX_VALUE, 20);
		System.out.println("결과: " + r1);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
		System.out.println("end of prog.");
	}		
	
	public static long add(long a, long b) {
		return a + b;
	}

	public static int add(int a, int b) {
		if(a > Integer.MAX_VALUE - b) {
			throw new ArithmeticException("범위 밖의 값입니다1.");
			//a (+ b - b) > max - b : 100 + 2147483647 > 2147483647
		} else if (a < Integer.MIN_VALUE + b){
			throw new ArithmeticException("범위 밖의 값입니다2.");
			//a (- b + b) < min + b : -10 < 2147483647 +2147483647
		}
		int result = a + b;
		return result;
	}
}
