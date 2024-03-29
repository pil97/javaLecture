package chapter11.string;

public class StringBuliderMain {
	public static void main(String[] args) {

		String str1 = "";

		for (int i = 1; i < 10; i++) {
			str1 += i + " 번째 문자열\n";
			System.out.println(System.identityHashCode(str1)); 
		}
	
		System.out.println(str1);

		StringBuilder sb = new StringBuilder("시작");

		for (int i = 1; i < 10; i++) {
			sb.append(i + " 번째 문자열\n");
			System.out.println(System.identityHashCode(sb));
		}
		
		System.out.println(sb);

	}
}
