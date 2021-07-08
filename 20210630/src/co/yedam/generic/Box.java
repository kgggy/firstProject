package co.yedam.generic;

public class Box<T> { //<T> => 어떤 클래스인진 모르지만 사용시점에 타입 정해줌.
	//private Object obj; // Object => 모든 유형의 클래스들을 사용할 수 있음.

	private T obj;
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
