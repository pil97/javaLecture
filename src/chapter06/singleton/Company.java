package chapter06.singleton;

// 디자인 패턴 중 싱글톤 패턴으로 구성하는 클래스이다.
// 싱글톤 패턴 디자인: 단 하나의 객체만 생성을 하고자 하는 목적.
public class Company {
	
	// 클래스 안에서 자신을 private static 맴버로 객체 생성.
	private static Company instance = new Company();
	
	// 생성자
	private Company() {
		
	}
	
	// public getter 메서드 정의: instance가 private 이므로 클래스 외부에서 접근이 막아져있으므로 getter 메서드 사용.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
