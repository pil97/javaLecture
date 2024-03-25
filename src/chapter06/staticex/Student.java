package chapter06.staticex;


// JVM이 운영체제로 부터 메모리 할당을 위임 받아서, 자바 프로그램을 실행할 때, 사용되는 메모리의 영역을 학습하는 예제
// static area(method area): 정적영역
public class Student {

	// 필드선언
	// 문법: 접근자 (static 선택) 데이터타입 변수;
	
	// 자바프로그램이 실행될 때, JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드, 메서드에 대하여 static area에 메모리를 생성한다.
	// static 필드(정적필드)
	private static int serailNum; // static 필드를 접근하는 메서드는 static 이어야 한다.
	
	// 인스턴스(instance) 필드: Student student = new Student(); - 객체 생성 구문이 실행이 될때만 stack, heap 영역의 메모리를 사용
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	// 생성된 기억장소의 값을 읽어오기 위한 목적의 메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	// static 필드는 클래스명.메서드()를 사용하여 static 필드에 있는 기억장소로 접근한다.
	public static int getSerialNum() {
		return serailNum;
	}


	public static void setSerailNum(int serailNum) {
		Student.serailNum = serailNum;
	}
	

	
	
}
