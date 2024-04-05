package chapter15.Stream;

import java.util.Arrays;

public class IntArrayMain {
	public static void main(String[] args) {
		
		// 배열은 참조타입이다.
		// 참조타입의 기억장소는 스택영역과 힙영역 2가지 영역으로 관리한다.
		int[] arr = {1, 2, 3, 4, 5};
		
		// arr 배열의 데이터 합계
		int sum = 0;
		
		// arr 배열의 1번째 요소는 arr[0]으로 인덱스가 사용되기 때문에, for문의 i = 0 하는 이유이다.
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		int sum2 = Arrays.stream(arr).sum();
		System.out.println(sum2);
		
		Long count = Arrays.stream(arr).count();
		int count2 = (int) Arrays.stream(arr).count();
		System.out.println(count);
		System.out.println(count2);
	}
}
