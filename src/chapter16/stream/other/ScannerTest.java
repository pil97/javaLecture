package chapter16.stream.other;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String str = sc.nextLine();
		System.out.println(str);
	}
}
