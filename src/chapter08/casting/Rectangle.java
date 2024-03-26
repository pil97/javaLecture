package chapter08.casting;

public class Rectangle extends Shape {

String shape = "사각형";
	
	// 부모클래스의 draw 메서드를 재정의
	@Override
	void draw() {
		System.out.println("draw Rectagle");
	}
	
	public Rectangle() {
		System.out.println("사각형 입니다.");
	}
}
