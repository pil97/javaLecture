package chapter11.object;

// 객체복사
public class ObjectCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle =  (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
	
		
	}
}


	class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "x = " + x + " y = " + y;
		}
		
	}
	
	// Circle 클래스를 객체로 생성 -> 객체 복사로 사용
	class Circle implements Cloneable{
		Point point;
		int radius;
		
		public Circle(int x, int y, int radius) {
			point = new Point(x,y);
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Circle [point=" + point + ", radius=" + radius + "]";
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		
		
	}
