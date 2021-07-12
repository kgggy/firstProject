package co.yedam.lambda;

@FunctionalInterface
interface Runnable { // 기능만 정의, 구현해야할 메소드가 하나만 있는 인터페이스에서만 람다식 가능.
	String run(String name);
	//void run(String name);
	// void swim();
}

class RunClass implements Runnable {
	@Override
	public String run(String name) { // Runnable 구현 메소드.
		System.out.println(name + "가 달립니다.");
		return name + "화이팅!";
	}

}

public class FunctionExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		String result = runnable.run("철수");
		System.out.println(result);

		runnable = new Runnable() { // 익명 구현 객체. => new 인터페이스() {구현 내용};ㅣ

			@Override
			public String run(String name) {
				System.out.println(name + "가 달립니다.");
				return name + "잘가~~";
			}
		};
		result = runnable.run("영희");
		System.out.println(result);

		// 람다표현식.
		runnable = (String name) -> { // 메소드, 매개값 부분만 남겨놓음.
			System.out.println(name + "이가 달립니다.");
			return name + "안녕~~~";
		};
		result = runnable.run("익명");
		System.out.println(result);
	}
}
//public class FunctionExample {
//	public static void main(String[] args) {
//		Runnable runnable = new RunClass();
//		runnable.run("철수");
//
//		runnable = new Runnable() { // 익명 구현 객체. => new 인터페이스() {구현 내용};ㅣ
//
//			@Override
//			public void run(String name) {
//				System.out.println(name + "가 달립니다.");
//			}
//		};
//		runnable.run("영희");
//
//		// 람다표현식.
//		runnable = (String name) -> { // 메소드, 매개값 부분만 남겨놓음.
//			System.out.println(name + "이가 달립니다.");
//		};
//		runnable.run("익명");
//	}
//}
