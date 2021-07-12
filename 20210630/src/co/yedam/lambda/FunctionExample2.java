package co.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int eScore;
	int mScore;

	public Student(String name, int eScore, int mScore) {
		super();
		this.name = name;
		this.eScore = eScore;
		this.mScore = mScore;
	}

	public String getName() {
		return name;
	}

	public int geteScore() {
		return eScore;
	}

	public int getmScore() {
		return mScore;
	}

}

// 매개값, 반환값 모두 있음.
public class FunctionExample2 { // class

	// field
	static List<Student> list = Arrays.asList(new Student("Hong", 80, 90), new Student("Park", 85, 73)); // add

	public static void printString(Function<Student, String> func) { // 기능을 매개값으로 받음(람다 표현식을 매개값으로 받음) <입력값(매개값), 리턴값>
		for (Student student : list)
			System.out.println(func.apply(student));
	}

	public static void printInt(ToIntFunction<Student> func) { //매개값 => ToIntFunction 인터페이스를 구현하는 기능.
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static void main(String[] args) {
		printString((Student t) -> {
			return t.getName();
		});

		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.geteScore(); 
			}
		});
	}

}
