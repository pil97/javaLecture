package chapter11.object;

public class EqualsMain {
	public static void main(String[] args) {
		Student stu1 = new Student(10, "park");
		Student stu2 = stu1;

		System.out.println(stu1);
		System.out.println(stu2);

		Student stu3 = new Student(10, "park");
		System.out.println(stu3);

		// 주소 비교
		if (stu1 == stu2) {
			System.out.println("주소가 같습니다.");
		} else {
			System.out.println("주소가 다릅니다.");
		}

		// 데이터 비교
		if (stu1.equals(stu3)) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("다릅니다.");
		}

		
		stu3.hashCode();

	}

}
