package co.yedam.modifier;

public class Example {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.getName(); //default는 동일한 패키지내에서는 호출가능.
		//private => 같은 클래스 내에서만 호출 가능
		//public => 모든 패키지에서 이용 가능
		
		Student s1 = new Student("홍길동");
	}

}
