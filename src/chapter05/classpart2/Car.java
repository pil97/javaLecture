package chapter05.classpart2;

// Car-java 파일을 컴파일하면 Car.class 파일에 Car()기본생성자가 자동으로 생성된다.
public class Car {

	// 객체: 자동차
	// 속성: 성격, 성질, 특성
	// - 속도, 모델, 색상
	// 프로그래밍: 변

	int speed;
	String model;
	String color;

	// 기능 및 동작
	// - 운전하다., 정지하다.
	// 프로그래밍: 메서

	// 운전기능
	void drive() {

	}

	// 정지기능
	void stop() {

	}

	// 생성자 메서드정의 - 일반 메서드랑 만드는 문법이 조그 틀리다.
	// Car.class 파일에 Car() 기본생성자가 생성되지 않도록 설계를 해두었다.
//	public Car(int speed, String model, String color) {
//		this.speed = speed;
//		this.model = model;
//		this.color = color;
//	}



}
