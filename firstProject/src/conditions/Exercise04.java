package conditions;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
			int ran = (int)(Math.random() * 6) + 1;
			int ran2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + ran + ", " + ran2 + ")");
			
			if (ran + ran2 == 5) {
				try {
					Thread.sleep(500); 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}
}
