package co.yedam.generic;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}
}

class PersonAscending implements Comparator<Person> { // 오름차순 정렬자. //클래스에 정의해버리면 오름차순만 정렬되므로 생성자에 매개값으로 넣어 내림차순도 사용할 수
														// 있도록 해줌.

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
}

class PersonDescending implements Comparator<Person> { // 내림차순 정렬자.

	@Override
	public int compare(Person o1, Person o2) {
		return o2.name.compareTo(o1.name);
	}
}

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> persons = new TreeSet<>(new PersonAscending());
		persons.add(new Person("Hong"));
		persons.add(new Person("Park"));
		persons.add(new Person("Choi"));
		persons.add(new Person("Kwon"));
		while (!persons.isEmpty()) {
			System.out.println(persons.pollFirst().name);
		}

		TreeSet<Person> persons2 = new TreeSet<>(new PersonDescending());
		persons2.add(new Person("Hong"));
		persons2.add(new Person("Park"));
		persons2.add(new Person("Choi"));
		persons2.add(new Person("Kwon"));
		while (!persons2.isEmpty()) {
			System.out.println(persons2.pollFirst().name);
		}
	}
}
