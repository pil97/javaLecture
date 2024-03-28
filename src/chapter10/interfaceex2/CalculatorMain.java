package chapter10.interfaceex2;

public class CalculatorMain {
	public static void main(String[] args) {
		 CompleteCalc cal = new CompleteCalc();
		int num1 = 10;
		int num2 = 5;
		
		int result1 = cal.add(num1, num2);
		int result3 = cal.substract(num1, num2);
		int result2 = cal.times(num1, num2);
		int result4 = cal.divide(num1, num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		cal.defaultMethod();
		Calc.staticMethod();
		
		
		System.out.println(Calc.PI);
		System.out.println(Calc.ERROR);
		
	}

}
