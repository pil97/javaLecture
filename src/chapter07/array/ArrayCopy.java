package chapter07.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 }; // 원본 배열
		int[] array2 = { 1, 2, 3, 4, 5 }; // 사본 배열

		System.out.println(array1.equals(array2));
		System.out.println(array1[0] == array2[0]);
		System.out.println("========================");

		// 배열 복사 기능
		// array1 배열의 인덱스 0 위치에서 array2 배열의 인덱스 1 위치에 4개를 복사한다.
		System.arraycopy(array1, 0, array2, 0, 5);

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

		System.out.println("========================");
		System.out.println(array1.equals(array2));
		System.out.println(array1[0] == array2[0]);
	}
}
