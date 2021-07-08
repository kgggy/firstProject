package co.yedam.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // String이 key값./Integer은 value.

		map.put("오혜지", 100);
		map.put("은영빈", 90);
		map.put("임효인", 93);
		map.put("은영빈", 60);

		Integer val = map.get("오혜지");
		System.out.println(val);

		Set<String> keys = map.keySet(); // map컬렉션에 있는 key값만 set컬렉션 타입으로 가져온다.
		Iterator<String> iter = keys.iterator(); //반복자를 선언해 무작위로 가져옴.
		while (iter.hasNext()) {
			String key = iter.next(); // key값을 set컬렉션에서 가져와서
			Integer value = map.get(key); // 그 key값을 활용해서 value를 읽어옴.
			System.out.println("key: " + key + ", val: " + value);
		}
	}
}
