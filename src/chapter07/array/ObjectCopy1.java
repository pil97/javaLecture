package chapter07.array;

// 배열복사: bookArray1 배열의 데이터를 bookArray2에 복사.
public class ObjectCopy1 {

	public static void main(String[] args) {
		// book 클래스를 이용하여 클래스 배열(객체배열) // 메모리 구조 표현
		Book[] bookArray1 = new Book[3]; // 원본
		Book[] bookArray2 = new Book[3]; // 사본

		bookArray1[0] = new Book("java", "park");
		bookArray1[1] = new Book("spring", "kim");
		bookArray1[2] = new Book("python", "lee");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();

		// 복사 전
		for (int i = 0; i < bookArray2.length; i++) {
			System.out.println(bookArray2[i].getBookName() + "/" + bookArray2[i].getAuthor());
		}

		System.out.println("=========================");

		// 복사 후
		// bookArray1 배열의 데이터를 bookArray2 배열로 복사
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].showBookInfo();
			// System.out.println(bookArray2[i].getBookName() +"/" +
			// bookArray2[i].getAuthor());
		}

		// bookArray1 배열의 값을 변경
		bookArray1[0].setBookName("DB");
		bookArray1[0].setAuthor("kang");
		
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		// bookArray1 배열 데이터 출력
		bookArray1[0].showBookInfo();
		
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		// bookArray2 배열 데이터 출력
		bookArray2[0].showBookInfo();

	}

}
