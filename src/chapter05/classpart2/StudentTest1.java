package chapter05.classpart2;

public class StudentTest1 {
	public static void main(String[] args) {
		
		// 메모리 구조: https://lucas-owner.tistory.com/38
		// 메모리 영역: 3개로 구성된다.
		// 1. Stack 영역 2. Heap 영역 3. Method(Static)영역 
		//
		// 객체 생성
		// new: 힙 영역 공간에 메모리(기억장소)를 생성하는 연산자
		Student stu1 = new Student();
		stu1.studentName = "kim";
		
		System.out.println(stu1);
		
	}
	

}
