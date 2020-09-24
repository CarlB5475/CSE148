package p2;

import p1.Name;

public class Textbook {
	private String title;
	private String isbn;
	private Name authorName;
	private double price;

	public Textbook(String title, String isbn, Name authorName, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		setAuthorName(authorName);
		setPrice(price);
	}

	public Textbook(String title, String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

	
	public void setAuthorAndPrice(String fn, String ln, double price) {
		this.authorName = new Name(fn, ln);
		this.price = price;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Name getAuthorName() {
		return authorName;
	}

	public void setAuthorName(Name authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Textbook [title=" + title + ", isbn=" + isbn + ", authorName=" + authorName + ", price=" + price + "]";
	}

}
