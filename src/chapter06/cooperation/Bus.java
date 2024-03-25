package chapter06.cooperation;

public class Bus {
	public int busNumber; // 버스번호
	public int passengerCount; // 승객수
	public int money; // 버스 수입액

	// 매개변수가 있는 생성자.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	// 버스에 승객을 태우는 기능
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 버스의 수입액과 승객 인원수 확인
	public void showInfo() {
		System.out.println("버스번호: " + busNumber + "번 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
