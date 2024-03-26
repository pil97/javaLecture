package chapter08.casting;

public class Circle extends Shape {
	
	
	
	// 부모클래스의 draw 메서드를 재정의
	
	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	Circle() {
		System.out.println("원 입니다.");
	}
	
	void method1() {
		super.draw();
	}
}
