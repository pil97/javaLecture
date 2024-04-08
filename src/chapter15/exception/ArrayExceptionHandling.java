package chapter15.exception;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];

		// arr[5] = 10; // 6번째 기억장소를 가리킨다. 실제 6번째 기억장소는 존재하지 않는다.

		// 예외처리 
		try {
			// 예외 발생되는 코드
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
			// ArrayIndexOutOfBoundsException
		} catch (Exception e) {
			// 예외가 발생되면, 동작
			System.out.println("------예외발생-------");
			System.out.println(e);
			System.out.println("------예외발생-------");
		}
		
		System.out.println("프로그램 종료");

	}
}
