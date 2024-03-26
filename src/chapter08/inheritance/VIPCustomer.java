package chapter08.inheritance;

public class VIPCustomer extends Customer {

	// 상속

	// 추가
	private int agentID;
	double saleRatio;

	// 생성자
	public VIPCustomer() {

		// 상속
		customerGrade = "VIP";
		bonusRatio = 0.05;

		// 자신
		saleRatio = 0.1;
		System.out.println("VIPCoustomer() 생성자 호출");
	}

	// 매개변수가 있는 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.5;
		saleRatio = 0.1;
	}

	// Overriding(메서드 재정의)
	// 부모클래스 메서드 이름만 사용하고 내용은 변경해서 작업하고자 할 떄
	@Override
	public int calcPrice(int price) {
		System.out.println("VIPCustomer.calPrice");
		bonusPoint += price * bonusRatio;
		return price * (int) (price * saleRatio);

	}

	public int getAgentID() {
		return agentID;
	}

}
