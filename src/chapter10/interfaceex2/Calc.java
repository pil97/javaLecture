package chapter10.interfaceex2;


// 인터페이스 -> 상속 목적으로 설계, 객체 생성 불가능
public interface Calc {

	// 구성요소
	// 상수, 추상메서드, default 메서드, static 메서드 - jdk 1.8
	// private 메서드 - jdk 1.9

	// 상수, final compile 하면, public final static 자동생성
	double PI = 3.14; // 상수: 어떤 특정값을 부르기위한 이름.
	int ERROR = -99999999;

	// 추상메서드 compile 하면, public abstract 자동생성
	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	// 일반 메서드 사용불가
	// public void methodA() {}

	// jdk 1.8부터 default, static 메서드 지원
	default void defaultMethod() {
		System.out.println("default 메서드");
		privateMethod();
	}

	static void staticMethod() {
		System.out.println("static 메서드");
	}

	// jdk 1.9부터 private 메서드 지원 -> 외부 클래스에서 접근 불가 -> 내부 메서드를 이용하여 접근 
	private void privateMethod() {
		System.out.println("private 메서드");
	}

}
