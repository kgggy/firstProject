package conditions;

public class ForExample2 {
	public static void main(String[] args) {
		int val = 12;
		for(int i = 1; i <= 9; i++) {
			//System.out.println("3 * " + i + " = " + (3 * i));
			System.out.println(val + " * " + i + " = " + (val * i));
			try {
				Thread.sleep(500); // 0.5초 기다린다는 뜻
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
