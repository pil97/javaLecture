package chapter05.classpart2;

public class Student {
	
	// 학생정보
	// 필드
	int studentId;
	String studentName;
	int grade;
	String address;
	
	// 메서드
	public String getStudentName() {
		
		return studentName;
	}
	
	
	
	// Student 클래스의 맴버가 아님.
	// 이렇게 사용은 가능하지만 실무에서 쓰지 않음.
	// 	-> 일반적으로 main() 메서드를 독립적인 파일로 사용함.
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName = "park";
		
		// 실제 작업을 하는 경우 -> 필드에 직접 접근하지 않고, 메서드를 이용하여 접근 -> 필드 값을 읽어옴.
		System.out.println(student.studentName); // 필드 사용
		System.out.println(student.getStudentName()); // 메서드 사용
		
		
	}

}
