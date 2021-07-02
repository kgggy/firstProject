package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp {
	
	private static PilatesApp singleton = new PilatesApp();
	
	private PilatesApp() {		
	}
	
	public static PilatesApp getInstance() {
		return singleton;
	}

	// 필드영역
	Member[] members = new Member[10];
	Scanner scn = new Scanner(System.in);

	public void main() {

		// 초기데이터 생성(수고를 줄이기 위해...)
		members[0] = new Member(1, "권", "01012341321", "970604", Gender.MEN);
		members[1] = new Member(2, "박", "01026262626", "950505", Gender.WOMEN);
		members[2] = new Member(3, "김", "01081635812", "961502", Gender.MEN);
		members[3] = new Member(4, "이", "01056486213", "981354", Gender.WOMEN);

		// 신규회원 1.입력, 2.수정, 3.삭제, 4.전체 회원 리스트, 5.이름조회, 6.상세조회 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine(); // 숫자 뿐 아니라 글도 불러올 수 있또록.

			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberUpdate();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 6) {
				showInfo1();
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// end of main()
		// 메인 메소드는 간단히, 다른 메소드 만들어서 활용하ㄱㅣ!!!!!

	public void showInfo1() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) // null이 아닌경우만 출력하기.
			{
				System.out.println("==================================");
				System.out.println(members[i].showInfo2());
				System.out.println("==================================");
			}
		}
	}

	public void memberUpdate() {
		int updId = scanInt("수정할 회원번호를 입력하세요 >>");
		scn.nextLine();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == updId) {
				String updname = scanString("이름 >>> ");
				if (updname.equals("")) { // 아무것도 입력 하지 않으면 아무것도 바뀌지 않음.
				} else {
					members[i].setMemberName(updname);
				}
				String updphone = scanString("연락처 >>> ");
				if (updphone.equals("")) {
				} else {
					members[i].setMemberPhone(updphone);
				}
				String updbirth = scanString("생일 >>> ");
				if (updbirth.equals("")) {
				} else {
					members[i].setMemberBirth(updbirth);
				}
				System.out.println("변경되었습니다.");
			}
		}
	}

	public void memberDelete() {
		int delId = scanInt("삭제할 회원번호를 입력하세요 >>");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == delId) {
				members[i] = null;
				System.out.println("1건 삭제되었습니다.");
				break;
			}
		}
	}

	public void searchByName() {
		String MemN = scanString("이름을 입력하세요. >>");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getMemberName().equals(MemN)) {
					System.out.println(members[i].showInfo());
					exist = true;
				}
			}
		}
		if (!exist) {
			System.out.println("이름이 존재하지 않습니다.");
		}
	}
//				 
//				else if (!members[i].getMemberName().equals(MemN)) {
//					System.out.println("조회된 데이터가 없습니다.");
//					continue;
//				}
//			} else if (members[i] == null) {
//				System.out.println(" ");

	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) // null이 아닌경우만 출력하기.
				System.out.println(members[i].showInfo());
		}
	}

	public void memberAdd() {
//		System.out.println("이름을 입력하세요 >>");
//		String name = scn.nextLine();
		String name = scanString("이름을 입력하세요 >> ");
		String phone = scanString("연락처를 입력하세요 >>");
		String birth = scanString("생일을 입력하세요 >>");
		Gender gender = scanGen("성별을 입력하세요(1:남, 2:여) >>");

		Member member = new Member(getNextId(), name, phone, birth, gender); // 멤버 클래스의 것을 쓰려면 new를 써서 인스턴스를 만들어 메모리에
																				// 올려야함.
		// Member 클래스에 정의된 순서대로 입력해야함.
//		member.setMemberName(name);
//		member.setMemberPhone(phone);
//		member.setMemberBirth(birth);
//		member.setMemberGen(gender);
//		member.setMemberId(getNextId());

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 비어있는 위치에만 입력하기.
				members[i] = member;
				break; // 비어있는 위치에 하나만 넣고 빠져나오기.
			}
		}

	}// memberAdd

	public String scanString(String msg) { // 입력메세지 출력 후 문자입력값을 반환.
		System.out.println(msg);
		String val = scn.nextLine();
		return val;
	}

	public int scanInt(String arg) {
		int val = 0;
		while (true) {
			try {
				System.out.print(arg);
				val = scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫지만 입력 가능합니다.");
				scn.nextLine();
			}
		}
		return val;

	}

	public Gender scanGen(String arg) { // 입력메세지 출력 후 Gender 반환.
		Gender gender = null;
		while (true) {
			try { // 정상 실행 구문
				System.out.println(arg);
				int gen = scn.nextInt(); // 예외가 발생하면 에러메세지 출력 후 다시 입력 메세지.
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2를 입력하세요.");
					continue; // 반복문을 빠져나가지 못하도록...
				}
				break; // return gender로 빠져나감.
			} catch (Exception e) { // 에러 발생시 구문. (사용자가 숫자가 아닌 문자를 입력했을 경우.)
				System.out.println("숫자를 입력하세요.");
				scn.nextLine(); // 엔터키 눌렀을 시 인지하도록.
			}
		}
		return gender;
	}

	public int getNextId() {
		// 회원번호는 가입 순서대로 => 1, 2, 3...
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버 아이디 중에서 최고번호.
				if (members[i].getMemberId() > memberId) { // null부분에 지금 있는 회원수에 1이 더해진 수의 아이디가 들어감.
					memberId = members[i].getMemberId();
				}
			}
		}
		memberId++;
		return memberId;
	}

	public void showMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("1.입력 2.수정 3.삭제 4.회원 리스트 5.이름조회 6.상세조회 9.종료");
		System.out.println("-----------------------------------------------------");
		System.out.println("선택 >>");
	}

}