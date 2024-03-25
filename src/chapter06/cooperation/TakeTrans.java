package chapter06.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student stu1 = new Student("park", 10000);
		Student stu2 = new Student("kim", 5000);
		
		Bus bus = new Bus(100);
		stu1.takeBus(bus);
		stu1.showInfo();
		bus.showInfo();
		
		Subway subway = new Subway(4);
		stu2.takeSubway(subway);
		stu2.showInfo();
		subway.showInfo();

	}

}
