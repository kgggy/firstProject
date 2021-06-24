package variable;

public class VaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 30;
		System.out.println(var1);
		var1 = 60;
		System.out.println(var1);

		long var2 = 100;
		var2 = 200;

		long sum = var1 + var2; // byte, char, short, int, long 순서로 큰 크기.
		// 크기가 큰 쪽에 맞춰줘야함

		String name = "Hong";
		char chr = 'A';
		chr++;
		chr++;
		System.out.println((int) chr + ", " + chr);
	}

}
