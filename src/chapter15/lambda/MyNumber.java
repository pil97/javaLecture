package chapter15.lambda;

// 함수형 인터페이스: 추상메서드 단 1개를 가지고 있는 인터페이스 

@FunctionalInterface // @이름: Annotation
public interface MyNumber {

	// 추상메서드
	int getMax(int num1, int num2);
	
	// int sum(int a, int b);
	
}
