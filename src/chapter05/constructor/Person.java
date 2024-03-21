package chapter05.constructor;

public class Person {	
	
	// 필드
	String name;
	double height;
	double weight;
	
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		System.out.println("생성자 호출");
	}

}
