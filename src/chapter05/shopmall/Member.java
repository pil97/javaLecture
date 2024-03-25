package chapter05.shopmall;

// 회원 
public class Member {

	String name;
	String id;
	String pwd;
	int age;
	char gender; // 성별 M: 남자, F: 여
	String zipcode;
	String addr;
	String hobby;

	public Member(String name) {
		
	}
	
	void register(String name, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		// 데이터베이스에 회원정보를 삽입하는 구문
	}

	void edit(String name, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		// 데이터베이스에 회원정보를 수정하는 구문
	}

	void delete(String id, String pwd) {
		// 데이터베이스에 회원정보를 삭하는 구문
	}

	boolean login(String id, String pwd) {
		// 데이터베이스에 아이디, 비밀번호 존재 유무 체크해서 존재하면 true, 존재하지 않으면 false

		return true;
	}

	// 아이디 중복체크
	boolean idCheck(String id) {

		// 데이터베이스에 아이디가 존재하지 않으면, 사용가능 true, 존재하면 사용 불가능 false
		if (this.id != id) {
			return true;
		} else {
			return false;
		}
	}

}
