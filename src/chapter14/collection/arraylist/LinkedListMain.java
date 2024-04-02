package chapter14.collection.arraylist;

import java.util.LinkedList;

// 자료구조: 링크드 리스트 예제
public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		System.out.println(myList); // A, B, C
		
		myList.add(1,"D"); 
		System.out.println(myList); // A, D, B, C
		
		myList.addFirst("0");
		System.out.println(myList); // 0, A, D, B, C
		
		System.out.println(myList.removeLast());
		System.out.println(myList); // 0, A, D, B
		
	}
}
