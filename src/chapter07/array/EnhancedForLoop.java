package chapter07.array;

public class EnhancedForLoop {

	public static void main(String[] args) {

		// 문자열 배열
		String[] str = { "java", "spring", "python" };

		// 전통적인 for문
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("=================");
		
		// 향상된 for문
		for (String s : str) {
			System.out.println(s);
		}

	}

}
