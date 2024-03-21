package chapter05.classpart;

public class AddMain {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 22;

		int result1 = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + result1 +"입니다.");
		
		int result2 = sub(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + result2 +"입니다.");
		
		double result3 = mul(num1, num2);
		System.out.println(num1 + " X " + num2 + " = " + result3 +"입니다.");
		
		double result4 = divide(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + result4 +"입니다.");
		
	}

	public static int add(int num1, int num2) {

		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {

		return num1 - num2;
	}
	
	public static double mul(int num1, int num2) {

		return (double)num1 * num2;
	}
	
	public static double divide(int num1, int num2) {

		return (double)num1 / num2;
	}

}
