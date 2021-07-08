package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;

//List 컬렉션: 배열처럼 여러 인스턴스를 저장.
public class BoxExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //배열의 인덱스값 => [0]
		list.add("모든 타입 가능");
//		list.add(100); => <String>으로 지정해줬으므로 컴파일 단계에서 에러 발생.
//		list.add(new Orange());
		
		for(int i=0; i<list.size(); i++) { //list는 컬렉션이므로 size(크기)로 지정.
			String val = (String) list.get(i); // = list[i]
			System.out.println(val);
		}
		
		String[] names = new String[10]; //배열은 열개 선언하면 초과되면 에러발생.
		for(int i=0; i<names.length; i++) {
			names[i] = new String("" + i);
		}
		
		for(int i=0; i<100; i++) {
			list.add(new String("" + i));
		}
		
	}
}
