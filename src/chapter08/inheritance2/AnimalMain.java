package chapter08.inheritance2;

public class AnimalMain {

	public static void main(String[] args) {

		Animal dog = new Dog();
		dog.run();
		dog.sound();

		Animal cat = new Cat();
		cat.run();
		cat.sound();

		Animal tiger = new Tiger();
		tiger.run();
		tiger.sound();

		Animal lion2 = new Lion();
		Lion lion = new Lion();
		lion.run();
		lion.sound();
		lion.play();

		if (lion2 instanceof Lion) {
			Lion lion3 = (Lion) lion2;
			lion3.play();
		}

	}

}
