package chapter11.classex;

public class PerosnMain {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p1 = new Person();
		
		// 클래스 위치 확인
		
		// (1)
		Class pClass = p1.getClass();
		System.out.println(pClass);
		System.out.println(pClass.getName());
		
		// (2)
		Class pClass2 = Person.class; // 직접 class 파일 사용
		System.out.println(pClass2.getName());
		
		// (3)
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName());
		
//		int result1 = p1.getAge();
//		String result2 = p1.getName();
//		
//		System.out.println(p1);
//		System.out.println(result1);
//		System.out.println(result2);
//		
//		p1.setAge(10);
//		p1.setName("park");
//		
//		int result3 = p1.getAge();
//		String result4 = p1.getName();
//		
//		System.out.println(p1);
//		System.out.println(result3);
//		System.out.println(result4);
		
	}
}
