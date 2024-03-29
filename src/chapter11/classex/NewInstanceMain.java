package chapter11.classex;

// newInstance() 메서드를 사용해 클래스 객체 생성하기
public class NewInstanceMain {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		// Person 클래스 설계(디자인) -> 객체 생성 작업
		Person p1 = new Person();
		System.out.println(p1);
		
		// 리플렉션 기법 "chapter11.classex.Person" 을 이용하여, person2 객체 생성
		Class pClass = Class.forName("chapter11.classex.Person");
		Person p2 = (Person) pClass.newInstance();
		System.out.println(p2);
	}
		
	
}
