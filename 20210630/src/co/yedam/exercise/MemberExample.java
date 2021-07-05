package co.yedam.exercise;

import co.yedam.pilates.Gender;
import co.yedam.pilates.Member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member(); //m1은 멤버 클래스의 내용을 담게됨.
		//멤버 클래스에 Member()형태의 생성자가 있어야함.
		m1 = new Member(101, "Hong", "0101231234", "0101", Gender.MEN);
		System.out.println(m1.getMemberId());
		m1 = new Member(102, "H3ong", "0101231234");
		System.out.println(m1.getMemberId() + ", " + m1.getMemberName() + ", " + m1.getMemberPhone());
	}

}
