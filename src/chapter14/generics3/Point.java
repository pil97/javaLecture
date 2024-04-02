package chapter14.generics3;

public class Point<T, V> {
	
	// 필드
	T x;
	V y;
	
	// 생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
