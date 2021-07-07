package co.friend.view;

import co.friend.access.FriendAccess;
import co.friend.access.FriendList;
import co.friend.common.ScannerUtil;
import co.friend.model.Friend;

//화면(콘솔)에 정보를 보여주고 사용자의 입력에 따라 처리해줘야함.
public class FriendCliApp {

	FriendAccess service = new FriendList(); // 파일에 연결할 경우
	// FriendAccess service = new FriendDB(); //DB에 연결할 경우(import도 해줘야함)

	public void start() {
		// 1.입력 2.수정 3.삭제 4.리스트 5.이름조회 6.전화번호조회 9.종료
		int menu = 0;
		do {
			menuTitle();
			menu = ScannerUtil.readInt("선택 >> ");

			switch (menu) {
			case 1: // 입력
				insert();
				break; // 2번으로 안가도록 막아줘야함.
			case 2: // 수정
				update();
				break;
			case 3: // 삭제
				delete();
				break;
			case 4: // 리스트
				list();
				break;
			case 5: // 이름조회
				searchName();
				break;
			case 6: // 전화번호조회
				searchTel();
				break;
			}

		} while (menu != 9); // 9번이 아닐 동안엔 계속 반복.
	}

	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		service.insert(friend); // 인터페이스 클래스의 insert를 받아옴.
	}

	public void update() {
		// 이름 기준으로 수정
		// 이름입력> 연락처입력>
		String name = ScannerUtil.readString("이름입력> ");
		String tel = ScannerUtil.readString("연락처입력> ");
		Friend friend = new Friend("", name, tel);
		service.update(friend);
	}

	public void delete() {
		// 이름 기준으로 삭제
		// 문자열을 배열에서 찾도록
		String name = ScannerUtil.readString("이름입력> ");
		service.delete(name);
	}

	public void list() {
		Friend[] friendList = service.selectAll();
		for (Friend friend : friendList) {
			if (friend != null) {
				System.out.println(friend.toString());
			}
		}
	}

	public void searchName() {
		String name = ScannerUtil.readString("이름입력> ");
		System.out.println(service.selectOne(name));
	}

	public void searchTel() {
		String tel = ScannerUtil.readString("전화번호 입력> ");
		System.out.println(service.findTel(tel));
	}

	public void menuTitle() {
		System.out.println("==== 친구 관리 ====");
		System.out.println("|  1. 친구 추가  |");
		System.out.println("|  2. 친구 수정  |");
		System.out.println("|  3. 친구 삭제  |");
		System.out.println("|  4. 전체 조회  |");
		System.out.println("|  5. 이름 조회  |");
		System.out.println("|  6. 전화 조회  |");
		System.out.println("|  9. 종료      |");
		System.out.println("=================");
	}
}
