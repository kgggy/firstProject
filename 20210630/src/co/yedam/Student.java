package co.yedam;

public class Student {
	private String name;
	private int grd;
	private int eng;
	private int math;
	
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
