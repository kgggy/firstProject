package co.yedam;

public class Student {
	private String name;
	private int grd;
	private int eng;
	private int math;
	
	public Student() {  //매개값이 없는 기본 생성자.(클래스 이름과 똑같음)
		//리턴타입이 없음, 초기값도 없는 인스턴스를 만들겠다는 뜻
	}
	
	public Student(String name) { //매개값을 가지는 생성자. name을 필드에 초기화시킴
		this.name = name;
	}


	public Student(String name, int grd) {
		this.name = name;
		this.grd = grd;
	}
	
	public Student(String name, int grd, int eng, int math) {
		this.name = name;
		this.grd = grd;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrd() {
		return grd;
	}
	public void setGrd(int grd) {
		this.grd = grd;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public void showInfo() {
		System.out.println("[이름: " + this.name + ", 학년 : " + this.grd + ", 영어점수 : " + this.eng + ", 수학점수 : " + this.math + "]");
	}
}
