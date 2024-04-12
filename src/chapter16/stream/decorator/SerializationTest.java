package chapter16.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	private static final long serialVersionUID = -3453004897960665710L;
	String name;
	transient String job;

	public Person() {
	}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

}

public class SerializationTest {
	public static void main(String[] args) {
		Person ps1 = new Person("홍길동", "의적");
		Person ps2 = new Person("손흥민", "축구선수");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(ps1);
			oos.writeObject(ps2);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 역직렬화
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
					Person p1 = (Person) ois.readObject();
					Person p2 = (Person) ois.readObject();
					
					System.out.println(p1);
					System.out.println(p2);
					
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
