package chapter11.object;

public class ToStringEx {
	public static void main(String[] args) {
		Student stu1 = new Student(3,"park");
		
		System.out.println(stu1); //  stu1.toString() 이게 생략됨.
	}
}
