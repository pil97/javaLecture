package chapter11.string;

public class StringMain1 {
	public static void main(String[] args) {
		
		String str1 = new String("aaa");
		String str2 = new String("aaa");
		
		System.out.println(str1 == str2); // 주소 비교로 false
		System.out.println(str1.equals(str2)); // 문자열 비교로 true
		
		String str3 = "aaa";
		String str4 = "aaa";
		
		System.out.println(str3 == str4); // true
		System.out.println(str3.equals(str4)); //true
	}
}
