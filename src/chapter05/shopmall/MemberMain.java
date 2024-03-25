package chapter05.shopmall;

public class MemberMain {
	public static void main(String[] args) {
		
		// 클래스 사용법
		// 객체생성
		// 클래스로 만든 변수를 다른 변수들이랑 구분하기 위하여 객체라고 부른다.
		
		// Member(): 클래스 이름으로 되어있는 메서드를 생성자라고 부른다.
		// new:  클래스를 이용하여 힙 영역에 메모리를 생성하는 기능
		Member member = new Member("1");
		
		member.addr = "1";
		
		Member member2; // 클래스로 만든 객체는 stack 영역에 공간(기억장소)이 생성됨.
		member2 = new Member("1");
		
	}
}
