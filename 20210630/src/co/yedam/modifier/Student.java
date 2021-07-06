package co.yedam.modifier;

class Teacher {
	private String name;
	private String major;

	Teacher() {
		// default
	}

	String getName() {
		// default
		return name;
	}
}

public class Student {
	private String name;
	private String major;
	private int grade;

	private Student() {
		// private
	}

//	Student(String name){
//		//default
//		this.name = name;
//	}

	protected Student(String name) {
		this.name = name;
	} //protected => 상속의 관계가 되면 패키지가 다르더라도 접근가능.
	//default => 패키지가 다르면 호출 불가능.

	public Student(String name, String major) {
		// public
		this.name = name;
		this.major = major;
	}
}
