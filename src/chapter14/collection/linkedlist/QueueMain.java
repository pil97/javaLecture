package chapter14.collection.linkedlist;

import java.util.ArrayList;

// 자료구조: 큐(Queue)를 ArrayList 클래스로 구현한 예제
class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// 데이터 저장(추가)
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// 데이터 꺼내오기
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return(arrayQueue.remove(0));
		
	}
}


public class QueueMain {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue()); // A
		System.out.println(queue.deQueue()); // B
		System.out.println(queue.deQueue()); // C
	}

}
