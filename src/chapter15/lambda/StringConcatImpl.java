package chapter15.lambda;

// 구현 클래스 
public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println("구현클래스 메서드: " + s1 + ", " + s2);
		
	}
	
}
