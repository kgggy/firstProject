package co.yedam.api;

class Apple implements Cloneable {
	int price;

	Apple(int price) {
		this.price = price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	@Override
	public boolean equals(Object obj) {
		Apple ap = (Apple) obj;
		return this.price == ap.price; // => return this.price == ((Apple)obj).price;
	}
}

public class ObjectExample {
	public static void main(String[] args) {
		Object obj = new Object();
		obj.equals(new Object());
		System.out.println(obj.equals(new Object())); // 두 개의 주소값 비교.

		Apple ap1 = new Apple(5000);
		Apple ap2 = new Apple(1000);
		try {
			Apple ap3 = (Apple) ap1.clone(); // ap1과 똑같은 인스턴스 만듦.(얕은복제)
			System.out.println("ap3: " + ap3.price);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(ap1.equals(ap2));
	}

}
