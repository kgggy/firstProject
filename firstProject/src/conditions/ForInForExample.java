package conditions;

public class ForInForExample {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println();
		}
		
	}
	
	
	public static void ex1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				System.out.print("i의 값 : "+ i + ", j의 값 : " + j + "\t");
				// \t => 공백 4칸
				//print => 줄바꿈 안해줌 println => 줄바꿈ㅇ
			}System.out.println();
		}
	}
}
