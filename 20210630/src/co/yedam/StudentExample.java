package co.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setGrd(1);
		s1.setEng(30);
		s1.setMath(70);
		
		Student s2 = new Student();
		s2.setName("김길동");
		s2.setGrd(3);
		s2.setEng(100);
		s2.setMath(100);
		
		Student s3 = new Student();
		s3.setName("박길동");
		s3.setGrd(2);
		s3.setEng(20);
		s3.setMath(10);
		
		//배열 선언 후 s1, s2, s3의 값을 저장.
		//배열의 요소중에서 영어점수가 최고인 점수를 출력.
		Student[] students = {s1, s2, s3}; //student를 담는 배열 => student[]
		
		int maxValue = 0;
		int maxMath = 0;
		int sum = maxValue + maxMath;
//		String name = ""; //문자 초기값은 ""
		Student maxStudent = null; // => 하나하나 변수 선언 안하고 한번에 선언. -> 불러올때 maxStudent로 한번에 가져올 수 있음.
		
		for(int i = 0; i < students.length; i++) {
			if(sum < students[i].getEng() + students[i].getMath()) {
				sum = students[i].getEng()+ students[i].getMath();
			} 

		}System.out.println("최대 점수 : " + sum + ", 이름 : " + maxStudent.getName() + ", 학년 : " + maxStudent.getGrd());
	}

}
