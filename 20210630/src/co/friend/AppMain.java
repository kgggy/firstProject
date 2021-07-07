package co.friend;
//디자인 : MVC패턴.

import co.friend.view.FriendCliApp;

//Model - 기능정의(인터페이스, 데이터의 처리 정의)하는 부분.
//View - 사용자에게 보여지는 부분.
//Control - 사용자의 요청(저장, 수정 등)처리에 대해서 제어.

public class AppMain { // 실행 클래스
	public static void main(String[] args) {
		FriendCliApp app = new FriendCliApp();
		app.start();
	}
}
