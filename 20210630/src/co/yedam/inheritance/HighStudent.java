package co.yedam.inheritance;

public class HighStudent extends Student { // student클래스의 하위
	// highstudent클래스는 student의 것들을 그대로 물려받음.
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
