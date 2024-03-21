package chapter05.classpart;

public class PersonMain {
	public static void main(String[] args) {
		// Person 클래스 사용
		// 기억장소가 생성된다는 의미
		Person per1 = new Person();
		
		// per1 객체가 가리키는 기억장소 표현
		per1.gender = '남';
		per1.name = "park";
		per1.height = 100;
		per1.married = false;
//		System.out.println(per1.gender);
		
		per1.getPersonInfo();
		
	}

}
