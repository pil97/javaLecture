package chapter15.lambda;

public class StringConcatMain {
	public static void main(String[] args) {
		
		String s1 = "X";
		String s2 = "Y";
		
		StringConcatImpl str1 = new StringConcatImpl();
		str1.makeString("A", "B");
		str1.makeString("X", "Y");
		
		System.out.println();
		
		StringConcat myLambda = (A, B) -> System.out.println("람다식: " + A + ", " +  B);
		myLambda.makeString("A", "B");
		myLambda.makeString(s1, s2);
		
		System.out.println();
		
		// 익명 구현 객체 사용
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				 System.out.println("익명 구현 객체: " + s1 + ", " +  s2);
			
			}
		};
		
		concat3.makeString(s1, s2);
		
	}
}
