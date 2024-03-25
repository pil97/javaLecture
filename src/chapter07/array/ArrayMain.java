package chapter07.array;

public class ArrayMain {
	public static void main(String[] args) {
		// 배열 생성: 동일한 데이터 타입으로 연속된 기억장소를 하나의 대표이름으로 관리하는 기능. 
		// 기본 데이터 타입으로 생성하는 배열
		// 기본 데이터 타입[] 배열이름 = new 기본 데이터 타입[] {값1, 값2, ...};
		
		
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] == number[5]) {
				number[i] = 60;
			}
			System.out.println(number[i]);
		}
		
		System.out.println(number[5]);
		System.out.println(number.length);
	}

}
