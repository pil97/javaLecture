package chapter11.object;

public class StringEquals {
	public static void main(String[] args) {
		
		// 기본 데이터 타입
		String name ="aaa";
		
		// 참조 데이터 타입
		String str1 = new String("aaa");
		String str2 = new String("aaa");
				
		// == : 주소값으로 비교
		System.out.println(str1 == str2);
		
		// String 클래스 - equals 재정의 : 힙영역에 있는 데이터 값으로 비교 -> 원래는 주소값 비교
		System.out.println(str1.equals(str2));		
		
		
		// 데이터 비교시
		/*
		 * 기본 데이터 타입은 == 비교 -> 스택 영역에 저장 되기 때문에 스택 영역에서 서로 비교
		 * String 기본, 참조 데이터 타입은 eqauls로 비교 -> 데이터가 힙영역에 있기 때문에 힙영역에서 비교해야함.
		 * == : 참조 데이터 타입으로 비교시, 주소값으로 비교함. -> String 클래스는 주소값으로 비교가 안됨. ( == 이거는 안써야함.) 
		 * 
		 */
		
		// 문자열 데이터 비교
		String str3 = "aaa";
		String str4 = "aaa";
		
		if (str3.equals(str4)) {
			System.out.println("동일하다.");
		} else {
			System.out.println("다르다.");
		}
		
		
	}
}
