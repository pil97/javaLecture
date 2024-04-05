package chapter15.lambda2;

public class LambdaMain {
	public static void main(String[] args) {

		// 인터페이스명 변수 = 추상메서드를 구현한 람다식 문법;
		PrintString ps = s -> System.out.println(s);
		ps.showString("test");
		ps.showString("Hello World");

		showMyString(ps);

		System.out.println();

		PrintString p = returnString();
		p.showString("1");
		
	}

	// 함수형 인터페이스를 메서드의 매개변수로 사용하기
	public static void showMyString(PrintString p) {
		p.showString("메서드: Hello World");
	}
	
	// 함수형 인터페이스를 메서드의 리턴타입으로 사용하기
	public static PrintString returnString() {
		
		// void showString(String str); 메서드에 대한 람다식 문법을 리턴으로 코드 작성
		return str -> System.out.println(str + "world");
		
	}

}
