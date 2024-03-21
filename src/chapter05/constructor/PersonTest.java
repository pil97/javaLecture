package chapter05.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("park",170,50);
		
		
		// 힙 영역에 생성된 Person 클래스의 필드값을 확인
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.weight);
	}
}
