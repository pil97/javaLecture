package chapter08.exam;

public class Child extends Parent {
	int c;
	int d;

	public Child() {
		// super();
		System.out.println("자식생성자 호출: Child()");
	}

	// 매개변수가 있는 생성
	public Child(int a, int b) {
		super(a, b); // 부모클래스의 생성자 호출;
	}

	void methodC() {

	}

	void methodD() {

	}

	// 컴파일러는 부모클래스의 메서드를 재정의하는 의미로 아래코드를 해석
	@Override // Annotation.
	void methodA() {
		// TODO Auto-generated method stub
		System.out.print("자식클래스에서 호출: ");
		super.methodA();
		System.out.println("자식클래스 메서드: methodA");
	}

}
