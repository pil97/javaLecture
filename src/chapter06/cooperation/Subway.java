package chapter06.cooperation;

public class Subway {
	public int lineNumber; // 지하철호선
	public int passengerCount; // 승객수
	public int money; // 지하철 수입액

	// 매개변수가 있는 생성자.
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	// 지허철에 승객을 태우는 기능
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 지하철의 수입액과 승객 인원수 확인
	public void showInfo() {
		System.out.println("지하철호선: " + lineNumber + "호선 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
