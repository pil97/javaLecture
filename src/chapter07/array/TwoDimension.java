package chapter07.array;

public class TwoDimension {
	public static void main(String[] args) {

		// 2 * 3 : 2행 3열
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, };

		// 두번째 행, 두번째 열을 출력하라.
		System.out.println(arr[1][1]);

		System.out.println("===========");

		System.out.println("수정 전: " + arr[0][2]);
		arr[0][2] = 30;
		System.out.println("수정 후: " + arr[0][2]);

		System.out.println("===========");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j + 1 != arr[i].length) {
					System.out.print(arr[i][j] + ", ");
				} else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
