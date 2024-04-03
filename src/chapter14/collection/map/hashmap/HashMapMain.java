package chapter14.collection.map.hashmap;

import java.util.HashMap;

// Map 인터페이스를 구현한 HashMap 클래스 예제

public class HashMapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("가", 1);
		map.put("나", 2);
		map.put("다", 3);
		map.put("라", 4);
		map.put("마", 5);
		
		System.out.println(map);
		System.out.println(map.get("가"));
	}
}
