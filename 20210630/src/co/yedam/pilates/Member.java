package co.yedam.pilates;

public class Member { //class
	//field
	//new를 이용하여 생성자 생성하여 값을 초기화해줌.
	private int memberId; //초기값 => 0
	private String memberName; //초기값 => null
	private String memberPhone;
	private String memberBirth;
	private Gender memberGen; // MEN, WOMEN만 들어갈 수 있도록 enum 생성
	


	public Member(int memberId, String memberName, String memberPhone) {
		super();
		this.memberId = memberId; //변수와 필드(this)를 구분하기 위해 this룰 이용.(
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	
	}

	public Member(int memberId, String memberName, String memberPhone, String memberBirth, Gender memberGen) {
//		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
		this.memberGen = memberGen;
	}
	
	public Member() {
		this.memberId = 100;
		
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public Gender getMemberGen() {
		return memberGen;
	}

	public void setMemberGen(Gender memberGen) {
		this.memberGen = memberGen;
	}

	public String showInfo() {
		String info = "회원번호: " + memberId + " 회원이름: " + memberName + //
				" 연락처: " + memberPhone + " 생년월일: " + memberBirth + " 성별: " + memberGen;
		return info;
	}
	
	public String showInfo2() {
		String info = "회원번호: " + memberId + "\t회원이름: " + memberName + //
				"\n생년월일: " + memberBirth +"\t연락처: " + memberPhone + "\n성별: " + memberGen;
		return info;
	}
}
