package chapter08.inheritance2;

public class Cat extends Animal {

	// 메서드
	@Override
	void run() {
		System.out.println("고양이가 달린다.");

	}

	@Override
	void sound() {
		System.out.println("야옹");
	}
}
