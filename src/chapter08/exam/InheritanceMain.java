package chapter08.exam;

public class InheritanceMain {
	public static void main(String[] args) {
		
		// 상속받은 클래스가 객체 생성이 되면, 내부적으로 어떤 일들이 일어나는지?
		// -> 힙영역에 new Parent() 객체 생성 -> new Child() 객체 생성 이 순서로 진행.
		// -> 힙영역에 부모클래스 기억장소가 생성되고, 부모 생성자 호출
		// -> 힙영역에 자식클래스 기억장소가 생성되고, 자식 생성자 호출
		Child child = new Child();
		
		
		System.out.println("====================");
		child.methodA();
		
		
		Child child2 = new Child(10, 20);
		
		
		System.out.println("====================");
		Parent parent = new Parent();
		
	}
}
