package co.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
		System.out.println("Student: " + std.getName() + "," + std.getStudNo());

		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고");
		System.out.println("HighStudent: " + highStd.getName() + "," + //
				highStd.getStudNo() + "," + highStd.getSchoolName());

		Student[] students = new Student[3]; //student클래스만 담겨질 수 있음.
		students[0] = std;
		students[1] = highStd;
		
		students[0].getName();
		students[0].getStudNo();
		
		//students[0]의 인스턴스가 HighStudent의 것이 맞으면 실행.
		if(students[0] instanceof HighStudent) { //instanceof => 타입이 같은지를 보는 연산자.
			HighStudent hsx = (HighStudent) students[0]; //형변환 시켜줘야함.
			hsx.getSchoolName();
		}
		students[0].showInfo();
		System.out.println(students[0].toString());
		
		students[1].getName();
		students[1].getStudNo();
//		students[1].getSchoolName(); 부모클래스 타입이므로 자식클래스의 내용은 담겨지지 않음.
		if(students[1] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1]; 
			hs.getSchoolName();
		}
		students[1].showInfo();
		System.out.println(students[1].toString());
		//int < byte
		//int <-- byte;
		//byte <-- (byte) int;
	}
}
