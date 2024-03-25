package chapter07.otherarray;

import chapter07.array.Book;

public class BookMain {

	public static void main(String[] args) {
		
		// 생성자 접근자 이해때문에 작성.
		// default 동일 패키지 접근 가능, 다른 패키지 접근 불가.
		// public 패키지 상관없이 모두 접근 가능.
		Book b1 = new Book();
		b1.showBookInfo();
		
		Book b2 = new Book("park","123");
		b2.showBookInfo();

	}

}
