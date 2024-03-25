package chapter07.array;

// 클래스 배열(객체배열)을 만들기 위한 클래스
public class Book {

	// 필드
	private String bookName; // 책 제목
	private String author; // 저자

	// 기본 생성자 형태
	public Book() {

	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 일반 메서드
	public void showBookInfo() {
		System.out.println(bookName + " - " + author);
	}
	
}
