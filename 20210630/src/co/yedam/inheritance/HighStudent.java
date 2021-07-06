package co.yedam.inheritance;

public class HighStudent extends Student { // student클래스의 하위
	// highstudent클래스(자식)는 student(부모)의 것들을 그대로 물려받음. --> 부모클래스의 name, stuNo 모두
	// 가지게됨.
	// 부모는 하나, 자식클래스는 여러개가 올 수 있음

	// 필드
	private String schoolName;

	// 생성자
	public HighStudent() {
		super(); // 부모클래스 중 매개값 없는 생성자 호출.
		System.out.println("HighStudent()");
	}

	public HighStudent(String name, int studNo, String schoolName) {
		super(name, studNo); // Student가 가지고있는 생성자를 호출해 값을 담아줌.
		this.schoolName = schoolName;
	}

	// 메소드
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override // 부모클래스가 갖고있는 메소드를 재정의하겠다는 의미. 문법적 오류가 있는 지 체크.(메소드 이름, 타입, 매개값 모두 같아야함)
	public void showInfo() {
		System.out.println("이름은 " + getName() + " 학생번호는 " + getStudNo() + " 학교는 " + schoolName);
	}

	@Override
	public String toString() {
		return "HighStudent [Name=" + getName() + ", StudNo=" + getStudNo() + ", schoolName=" + schoolName + "]";
	}

//	@Override
//	public String toString() {
//		return "이름은 " + getName() + " 학생번호는 " + getStudNo() + " 학교는 " + schoolName;
//	}

}
