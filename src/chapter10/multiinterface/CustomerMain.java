package chapter10.multiinterface;

public class CustomerMain {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		Sell seller = customer;
		
		buyer.buy();
		buyer.order();
		
		seller.sell();
		seller.order();
		
		((Customer)seller).order();
	}
}
