package chapter15.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListMain {
	public static void main(String[] args) {
		
		
		// List 컬렉션
		List<String> sList = new ArrayList<String>();
		sList.add("park");
		sList.add("lee");
		sList.add("kim");
		
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		for(String s : sList) {
			System.out.println(s);
		}
		
		// stream 사용 
		Stream<String> stream1 = sList.stream();
		stream1.forEach(s -> System.out.println(s + " "));
		
		System.out.println();
		// 정렬
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
		
		
	}
}
