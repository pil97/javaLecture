package chapter14.collection.hashset;

import java.util.HashSet;

public class HashSetMain {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("손흥민"));
		hashSet.add(new String("김민재"));
		hashSet.add(new String("황희찬"));
		hashSet.add(new String("손흥민"));
		
		System.out.println(hashSet); // 손흥민 중복데이터 확인
	}
}
