package chapter08.casting;


// 형변환(Casting)
// 참조타입: 클래스가 다른 

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape1 = new Circle();
		shape1.draw();
		
		System.out.println("===================");
		
		Shape shpae2 = new Rectangle();
		shpae2.draw();
		
		
		// shpae1 객체가 Circle 클래스로 생성된 객체인지 여부 확인.
		if (shape1 instanceof Circle) {
			Circle c1 = (Circle) shape1;
			c1.method1();
			
			
			System.out.println(shape1);
			System.out.println(c1);
		}
		
		
		
	}

}
