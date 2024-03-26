package chapter07.array;

public class TwoDimension2 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 4 }, { 2, 5 }, { 3, 6 } };

		arr[1][1] = 7;
		System.out.println(arr[1][1]);

		System.out.println("========================");
		
		arr[2][1] = 8;
		System.out.println(arr[2][1]);

		System.out.println("========================");
		
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j + 1 == arr[i].length) {
					System.out.print((i + 1) + "행" + (j + 1) + "열 = " + arr[i][j]);
				} else {
					System.out.print((i + 1) + "행" + (j + 1) + "열 = " + arr[i][j] + ", ");
				}
			}
			System.out.println();
		}

	}
}
