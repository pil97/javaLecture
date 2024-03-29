package chapter11.object;

import java.util.Objects;

// Object 클래스: 오픈 클래스를 자동으로 상속해준다.
// class Student extends Object
public class Student {
	int grade;
	String name;

	public Student(int grade, String name) {
		// super(); // 부모 클래스의 기본생성자 호출 -> 없으면 Object 생성자 호출 -> 컴파일하면 자동생성됨. 생략가능
		this.grade = grade;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", score=" + name + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return super.hashCode();
		return grade;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals 메서드");
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (grade == std.grade && name.equals(std.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
