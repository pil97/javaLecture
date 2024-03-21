package chapter05.classpart;

public class MemberMain {
	public static void main(String[] args) {
		// 객체 생성
		Member member = new Member();
		
		
		// 회원가입페이지로 사용자 데이터를 입력 받아, Member 클래스의 객체에 저장된다.
		// 스프링을 통하여, 객체가 가지고 있는 데이터를 데이터베이스에 저장하게 된다.

		member.birth = "d";
	}
}
