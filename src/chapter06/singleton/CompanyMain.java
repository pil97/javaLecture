package chapter06.singleton;

public class CompanyMain {
	public static void main(String[] args) {
		
		// 싱글톤 패턴 클랫로 객체 생성 불가능
		// Company company = new Company();
		
		// com1은 미리 생성된 객체 동일한 객체의 주소를 갖게 된다.
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		System.out.println(com1 == com2);
	}

}
