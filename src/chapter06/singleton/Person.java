package chapter06.singleton;

public class Person {
	private static Person person = new Person();
	
	
	private Person() {};
	
	public static Person getPerson() {
		if (person == null) {
			person = new Person();
		} 
		return person;
	}
	
	

}
