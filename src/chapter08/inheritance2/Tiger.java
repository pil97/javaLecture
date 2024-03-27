package chapter08.inheritance2;

public class Tiger extends Animal {
	// 메서드
	@Override
	void run() {
		System.out.println("호랑이가 달린다.");

	}

	@Override
	void sound() {
		System.out.println("어흥");
	}
}
