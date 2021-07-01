package co.yedam;

public class Person {
	// 이름, 나이, 키, 혈액형
	private String name; // private -> 다른 클래스에서는 접근 못하도록 하는 것.
	private int age;
	private double height;
	private String bloodType;

	// 필드에 직접 접근 못하게
	// 오른쪽마우스 -> source -> generate Getters and Setters
	public String getName() { // get => 메소드 불러올 수 있도록 해줌
		return name;
	}

	public void setName(String name) { // set => 메소드 지정
		this.name = name;
	}

	public int getAge() { // 매개값이 없도록 정의해놓았으므로 ()내에 아무것도 없음.
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
		System.out.println("[이름: " + this.name + ", 나이 : " + this.age + ", 키 : " + this.height + ", 혈액형 : "
				+ this.bloodType + "]");
	}

	public String getInfo() {
		return "{이름: " + this.name + ", 나이 : " + this.age + ", 키 : " + this.height + ", 혈액형 : " + this.bloodType + "}";
	}

	public int getSum(int n1, int n2) {
		return n1 + n2;
	}

// 10 ~ 20 사이의 임의값을 생성해주는 메소드.
	public int getFrom10To20() {
		return (int) (Math.random() * 10) + 10;
	}

//n1 ~ n2 사이의 임의값을 생성해주는 메소드.
	public int getFrom10To30(int n1, int n2) {
		return (int) (Math.random() * (n2 - n1)) + n1;
	}

//매개값으로 문자(이름), 숫자(나이) => 제 이름은 ??이고 나이는 ?? 입니다.
//메소드이름 getNameAndAge
	public String getNameAndAge(String nn, int ae) {
		return "제 이름은 " + nn + "이고 나이는 " + ae + "입니다.";
	}

	public Person createNewPerson(String name, int age, String bloodType) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		psn.setBloodType(bloodType);

		return psn;
	}

	public Person createNewPerson(String name, int age, double height, String bloodType) { //메소드 이름이 같아도 매개값이 달라지면 다른 메소드로 봄
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		psn.setHeight(height);
		psn.setBloodType(bloodType);
		return psn;
	}
}
