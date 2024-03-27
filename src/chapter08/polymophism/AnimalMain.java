package chapter08.polymophism;

// 다형성 학습하기 위한 예제
// 부모클래스: super
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	// 재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	// 추가 메서드
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	// 재정의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	// 추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	// 재정의
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}

}

class Lion extends Animal {
	@Override
	public void move() {
		System.out.println("사자가 네 발로 뜁니다.");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
			// 다형성 작업
			AnimalMain am = new AnimalMain();
		
			am.moveAnimal(new Human());
			am.moveAnimal(new Tiger());
			am.moveAnimal(new Eagle());
			am.moveAnimal(new Lion());
	}
	
	// 디형성 기능의 메서드 정의
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}





























