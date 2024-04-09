package chapter15.exception;

public class NullException2 {
	public static void main(String[] args) {
		
		
		//참조타입 기본값은 보통 null을 사용한다.
		String str = null;
		
		
		// 예외처리
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("프로그램 종료");
		
	}
}
