package chapter05.classpart;


// 일반 정보를 저장하기 위한 데이터타입을 설계하는 클래스 
public class Person {
	// 변수설계
	// 클래스에서 만든 변수 -> 필드
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	
	
	// 메서드: 필드가 만든 기억장소에 접근해서 데이터를 이용한 기능목적.
	public void getPersonInfo() {
		System.out.println("이름" + name);
		System.out.println("신장" + height);
		System.out.println("몸무게" + weight);
		System.out.println("성별" + gender);
		System.out.println("결혼유무" + married);
		
		
		// 메서드 기본구조
		// 리턴타입 매서드이름(매개변수 선언) {
		//	...
		//	return 사용유무
		//	}
	}
}
