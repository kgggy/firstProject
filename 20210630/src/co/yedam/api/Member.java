package co.yedam.api;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override //얕은복사로 name, age 복제.
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //score깊은복제
		cloned.car = new Car(this.car.model);
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
