package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>(); // HashSet => 인덱스값으로 지정못함.
		names.add("박지현");
		names.add("박현진");

		System.out.println("크기 : " + names.size());
		Iterator<String> iter = names.iterator(); // 반복자를 생성해주는 메소드.
		while (iter.hasNext()) { // 더 가져올 요소가 남아있는지 => true/false
			String val = iter.next(); //순서 없이 무작위로 출력.
			System.out.println("값: " + val);
		}
		System.out.println("==================");
		names.add("안의정");
		names.add("안의정"); //중복된 값은 허용되지 않음. //"" => 같은 인스턴스, new String() => 다른 인스턴스. //String 클래스는 값이 같으면 같다고 정의되어있음.
		iter = names.iterator(); //내용 추가하면 다시 반복자를 생성해줘야함.
		while (iter.hasNext()) {
			String val = iter.next(); //한 건을 끄집어냄.
			System.out.println("값: " + val);
		}
		System.out.println("프로그램 종료.");
	}
}
