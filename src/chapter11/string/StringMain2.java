package chapter11.string;

public class StringMain2 {
	public static void main(String[] args) {
		String str1 = new String("str1");
		String str2 = new String("str2");
		
		System.out.println(str1);
		System.out.println(str1 +" 문자열 주소값: " + System.identityHashCode(str1));
		
		// 
		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println(str1 +" 문자열 주소값: " + System.identityHashCode(str1));
		
		System.out.println(str1.toUpperCase());
	}
}
