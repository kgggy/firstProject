package co.yedam.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.*; // => java.util에 있는 모든 패키지를 불러오겠다.?

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(); //ArrayList => 구현객체.
		names.add("권가영");
		names.add("김유리");
		names.add("김유리"); //중복된 값도 허용됨.(인덱스 값으로 파악하므로)
		names.add("김지연");
		names.add(1, "박라원"); //배열의 경우는 인덱스1 위에 덮어쓰지만 list는 하나씩 밀어짐.
		//names.add(6, "박주현"); //인덱스 범위 내에서만 추가 가능.
		names.remove(0); //인덱스 0자리가 삭제됨.
		names.remove("김유리");
		names.clear();//전체 삭제.
		System.out.println("크기 " + names.size());//java.lang.String => lang 패키지에 있으므로 import안해줘도됨.
		
		for(int i=0; i<names.size(); i++) {
			System.out.println("i값: " + i + ", name: " + names.get(i));
		}
		
		names = new LinkedList<String>(); //ArrayList보다 더 실행속도 단축시킬 수 있음.(ArrayList => 앞당기는 방식, LinkedList => 끊어진 곳의 앞뒤를 연결하는 방식)
		
	}

}
