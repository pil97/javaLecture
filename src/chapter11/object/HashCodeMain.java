package chapter11.object;

public class HashCodeMain {
	public static void main(String[] args) {
		String str1 = new String("aaa");
		String str2 = new String("aaa");
		
		Student st1 = new Student(1, "park");
		Student st2 = new Student(1, "lee");
		
		
		// 객체의 해시코드 값 확인하기.
		// 해시코드 값을 이용하여, 힙영역의 주소를 참조한다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
	}

}
