package co.yedam;

public class MethodExample3 {
	public static void main(String[] args) {
		Student s1 = new Student("최예원", 1, 70, 85); //s1에 인스턴스 담음
		//생성자를 통해 모든 값을 세팅.
		
//		s1.setName("최예원"); //값을 바꾸고싶을땐 따로 입력
//		s1.setGrd(1);
//		s1.setEng(80); 
//		s1.setMath(85);
		
		Student s2 = new Student("김지연", 2, 70, 77);
		Student[] javaClass = {s1, s2, new Student("최유리", 2, 65, 80)}; //배열에 바로 인스턴스 추가.
		
		for (int i = 0; i<javaClass.length; i++) {
			if(javaClass[i].getGrd() == 2) {
				System.out.println(javaClass[i].getName() + ", " + javaClass[i].getGrd() + ", " + javaClass[i].getEng() + ", " + javaClass[i].getMath());	
			}
		}
		//System.out.println(s1.getName() + ", " + s1.getGrd() + ", " + s1.getEng() + ", " + s1.getMath());
	}

}
