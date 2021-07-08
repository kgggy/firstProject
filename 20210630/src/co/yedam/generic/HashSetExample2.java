package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Apple {
	String group;
	int price;

//	Apple(int price) {
//		this.price = price;
//	}

	Apple(String group, int price) {
		this.price = price;
		this.group = group;
	}

//	@Override //ctrl+space => 클래스내에서 쓸수있는 모든 메소드
//	public int hashCode() {
//		return this.price; //price를 해쉬코드로 쓰겠다.
//	}

	@Override
	public int hashCode() {
		return this.group.hashCode() + this.price; // 동일한종류, 동일한가격이면 hashCode가 같은값.
	}

//	@Override
//	public boolean equals(Object obj) {
//		Apple other = (Apple) obj;
//		return this.price == other.price; //두번째 들어온 값과 비교.(price가 같으면 동일한 객체로 인식하도록)
//	}

	@Override
	public boolean equals(Object obj) {
		Apple other = (Apple) obj;
		return this.group.equals(other.group) && this.price == other.price;
	}
}

public class HashSetExample2 {
	public static void main(String[] args) {
		// Set : 중복된 값을 허용하지 않음.
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("부사", 1000));
		set.add(new Apple("부사", 1000));
		set.add(new Apple("부사", 1500)); // 같아보이지만 모두 다른 주소값이므로 중복값이 아님. => hashCode, equals가 동등해야 중복으로 판단.
		set.add(new Apple("아오리", 1000));

		Iterator<Apple> iter = set.iterator();
		while (iter.hasNext()) {
			Apple app = iter.next();
			// System.out.println("해쉬코드: " + app.hashCode()); //private없으므로 다른 클래스지만 같은
			// 패키지이므로 바로 사용가능.
			System.out.println("종류: " + app.group + " , 가격 : " + app.price);
		}
	}
}
