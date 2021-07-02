package co.yedam.pilates;

public class Main { // 실행 클래스(나머지는 라이브러리 클래스)
	public static void main(String[] args) {
		PilatesApp app = PilatesApp.getInstance(); // 클래스에 싱글턴이라는 인스턴스를 하나만 만들겠다는..?
		app.main();

		PilatesApp app2 = PilatesApp.getInstance(); // 인스턴스
		app2.main();
		System.out.println(app == app2);
	}

}
