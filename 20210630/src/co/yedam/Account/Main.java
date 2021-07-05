package co.yedam.Account;

//실행 클래스(main)
public class Main {
	public static void main(String[] args) {
		//첫번째 방법
	//	BankApplication.getInstance().exe();
		//두번째 방법
		BankApplication app = BankApplication.getInstance();
		app.exe();		

	}
}
