package chapter08.inheritance2;

public class Dog extends Animal {

	// 메서드
	@Override
	void run() {
		System.out.println("강아지가 달린다.");

	}

	@Override
	void sound() {
		System.out.println("멍");
	}

}
