package cn.cqswxy.spring.entity;

import java.math.BigDecimal;

public class Book {
	
	private Integer bookId;
	private String bookName;
	private BigDecimal bookPrice;
	private String bookAuthor;
	private String bookPages;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BigDecimal getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(BigDecimal bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPages() {
		return bookPages;
	}
	public void setBookPages(String bookPages) {
		this.bookPages = bookPages;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
				+ bookAuthor + ", bookPages=" + bookPages + "]";
	}
	
}
