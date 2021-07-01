package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp {

	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 신규회원 1.입력, 2.수정, 3.삭제, 4.전체 회원 리스트, 5.이름조회, 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine(); // 숫자 뿐 아니라 글도 불러올 수 있또록.

			if (menu == 1) {
				memberAdd();

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				memberList();

			} else if (menu == 5) {

			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// end of main()
	//메인 메소드는 간단히, 다른 메소드 만들어서 활용하ㄱㅣ!!!!!

	public static void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) // null이 아닌경우만 출력하기.
				System.out.println(members[i].showInfo());
		}
	}

	public static void memberAdd() {
		System.out.println("이름을 입력하세요 >>");
		String name = scn.nextLine();
		System.out.println("연락처를 입력하세요 >>");
		String phone = scn.nextLine();
		System.out.println("생일을 입력하세요 >>");
		String birth = scn.nextLine();
		System.out.println("성별을 입력하세요(1.남, 2.여) >>");
		int gen = scn.nextInt();
		Gender gender = null;
		if (gen == 1) {
			gender = Gender.MEN;
		} else if (gen == 2) {
			gender = Gender.WOMEN;
		} else {
			System.out.println("잘못된 값입니다.");
		}

		Member member = new Member();
		member.setMemberName(name);
		member.setMemberPhone(phone);
		member.setMemberBirth(birth);
		member.setMemberGen(gender);
		member.setMemberId(getNextId());

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 비어있는 위치에만 입력하기.
				members[i] = member;
				break; // 비어있는 위치에 하나만 넣고 빠져나오기.
			}
		}

	}

	public static int getNextId() {
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

	public static void showMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("1.입력 2.수정 3.삭제 4.회원 리스트 5.이름조회 9.종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택 >>");
	}

}