package chapter08.inheritance;


// 부모클래스(상위 클래스): 상속을 주는 클래스
public class Customer {
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	// 매개변수가 있는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	// 일반메서드
	public int calcPrice(int price) {
		System.out.println("Customer.calPrice");
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setGetCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setGetCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}


