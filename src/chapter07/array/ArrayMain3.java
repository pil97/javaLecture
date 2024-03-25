package chapter07.array;

public class ArrayMain3 {

	public static void main(String[] args) {
		// boolean배열 데이터 타입으로 요소 10개를 생성 구문으로 작성하라.
		// 인덱스 0, 3, 6, 9 번은 true로 변경하라.
		// for문으로 배열을 출력하라.

		boolean[] boolArr = new boolean[10];

		for (int i = 0; i < boolArr.length; i++) {
			if (i % 3 == 0) {
				boolArr[i] = true;
			}
			System.out.println(boolArr[i]);
		}

	}

}
