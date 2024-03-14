package kr.or.ddit.study06.sec06;

public class Book {
	// 책 이름 저자 출판사 추란일
	// toString get/setter 만들어서 3권 호출해볼것
	private String bookName;
	private String writerName;
	private String publisher;
	private String date;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", writerName=" + writerName + ", publisher=" + publisher + ", date="
				+ date + "]";
	}
	
	
	
}

	