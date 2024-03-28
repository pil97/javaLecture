package chapter10.multiinterface;

public class Customer implements Sell, Buy {

	@Override
	public void buy() {
		System.out.println("구매하기");

	}

	@Override
	public void sell() {
		 System.out.println("판매하기");

	}

	@Override
	public void order() {
		// Buy.super.order();
		// Sell.super.order();
		System.out.println("주문");
	}

}
