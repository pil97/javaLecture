package chapter08.exam;

public class Parent {
	int a;
	int b;

	public Parent() {
		System.out.println("부모생성자 호출: Parent()");
	}

	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	void methodA() {
		System.out.println("부모클래스 메서드: methodA");
	}

	void methodB() {

	}
}
