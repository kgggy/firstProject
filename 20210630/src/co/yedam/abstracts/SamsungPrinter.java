package co.yedam.abstracts;

public class SamsungPrinter extends Printer {

	public SamsungPrinter(String modelName) {
		super(modelName);
	}
	
	
	//추상메소드는 상속받는 클래스에서 반드시 구현해야함.
	@Override
	public void printing() { 
		System.out.println("삼성프린터를 출력합니다.");
	}

}
