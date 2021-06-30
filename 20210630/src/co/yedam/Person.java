package co.yedam;

public class Person {
	// 이름, 나이, 키, 혈액형
	private String name; // private -> 다른 클래스에서는 접근 못하도록 하는 것.
	private int age;
	private double height;
	private String bloodType;
	
	//필드에 직접 접근 못하게
	//오른쪽마우스 -> source -> generate Getters and Setters
	public String getName() { //get => 메소드 불러올 수 있도록 해줌
		return name;
	}
	public void setName(String name) { //set => 메소드 지정
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

public void showInfo() {
	System.out.println("[이름: " + this.name + ", 나이 : " + this.age + ", 키 : " + this.height + ", 혈액형 : " + this.bloodType + "]");
}
public String getInfo() {
	return "{이름: " + this.name + ", 나이 : " + this.age + ", 키 : " + this.height + ", 혈액형 : " + this.bloodType + "}";
}
}
