package chapter15.exception;

class Person {
	int a;
}


public class NullException {
	public static void main(String[] args) {
		
		Person ps = null;
		
		try {
			System.out.println(ps.a); // 힙영역에 기억장소가 존재하지 않아, 없는 기억장소를 접근하고 있어 실행시 오류 발생.	
		} catch (NullPointerException e) { 
			System.out.println("예외발생");
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}
}
