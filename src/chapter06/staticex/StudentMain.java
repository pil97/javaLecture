package chapter06.staticex;

public class StudentMain {

	public static void main(String[] args) {
		// JVM이 main() 메서드를 호출하면서, 프로그램이 실행 될 때, static area에 메모리를 단 한번만 생성한다.
		// -> Student 클래스의 static 필드와 메서드에 있는 데이터를 생성된 저장소에 저장한다. 
		Student.setSerailNum(0);
		System.out.println(Student.getSerialNum());
		Student student = new Student();

		student.setCount(5);
		System.out.println(student.getCount());
		
		
	}

}
