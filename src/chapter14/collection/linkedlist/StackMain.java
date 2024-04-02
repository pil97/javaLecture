package chapter14.collection.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// 데이터 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 데이터 꺼내오기
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove(len - 1));
	}
	
	public void showStack() {

	}
}



// 자료구조: ArrayList 클래스를 이용하여, 스택을 구현한 예제
public class StackMain {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		// 데이터 저장하기 		
		// 저장 순서: A, B, C
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		// 데이터 꺼내오기
		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
		
		
	}
}
