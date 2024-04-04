package chapter15.lambda;


// 인터페이스를 이용한 구현클래스
class Test implements MyNumber {
	
	@Override
	public int getMax(int num1, int num2) {
		
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
		
	}
	
}

public class MyNumberMain {
	public static void main(String[] args) {

		// 방법1. 인터페이스를 설계하고, 상속받아 구현클래스를 만들고 사용하는 기본적인 형태
		Test test = new Test();
		int result = test.getMax(5, 3);
		System.out.println(result);
		System.out.println();
		
		// 방법2. 함수형 인터페이스 경우에만, 람다식 문법으로 추상메서드를 구현
		// 함수형 인터페이스의 추상메서드를 람다식 문법으로 표현
		/*
		 * 
		 *	인터페이스 변수 = 추상메서드를 구현한 람다식 문법 코딩;
		 * 
		 * */
		
		// MyNumber new = 람다식으로 getMax() 추상메서드를 구현작업;
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(5, 5));
	}
}
