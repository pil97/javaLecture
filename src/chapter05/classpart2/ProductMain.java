package chapter05.classpart2;

public class ProductMain {
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		
		
		Product p2 = new Product("TV", 50000000);
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		
		
	}

}
