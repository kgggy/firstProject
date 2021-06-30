package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		int num1 = 10;
		// num1 = 1.2;
		Person p1 = new Person(); // 이름, 나이, 키, 혈액형 담을 수 있는 인스턴스가 만들어짐.
		// 선언만 한 상태 -> 초기값이 할당되어져있음.

		p1.setName("홍길동");// p1.name = "홍길동";
		p1.setAge(20);// p1.age = 20;
		p1.setHeight(175.5);// p1.height = 170.5;
		p1.setBloodType("AB");// p1.bloodType = "AB";
		p1.setName("오혜지");// p1.name = "오혜지"; // 속성 바꿀 수 있음
//		System.out.println(p1.name + ", " + p1.age + ", " + p1.height);

		Person p2 = new Person();
		p2.setName("김길동");// p2.name = "김길동";
		p2.setAge(28);// p2.age = 25;
		p2.setHeight(183.9);// p2.height = -183.3;
		p2.setBloodType("B");// p2.bloodType = "B";

		Person p3 = new Person();
		p3.setName("권가영");// p3.name = "권가영";
		p3.setAge(25);// p3.age = 25;
		p3.setHeight(163.2);// p3.height = 163.3;
		p3.setBloodType("A");// p3.bloodType = "A";

		Person[] persons = { p1, p2, p3 }; // 선언하면서 담기
		// 새로운 인스턴스(사람) 선언 : 여러분의 정보를 담아서 배열에 추가해보기

		for (int i = 0; i < persons.length; i++) {
			// 혈액형이 AB인 사람만 조회.
			// if(persons[i].bloodType.equals("AB"))
			// 나이가 23 이상인 사람만 조회.
			if (persons[i].getAge() >= 23) {
				persons[i].showInfo();
				System.out.println(persons[i].getInfo());
				
		}
	}
	}
}
