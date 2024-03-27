package chapter08.inheritance2;

public class Lion extends Animal{

	@Override
	void run() {
		System.out.println("사자가 달린다.");
	}
	
	@Override
	void sound() {
		System.out.println("사자 울음소리");
	}
	
	void play() {
		System.out.println("사자가 운동을 한다.");
	}
}
