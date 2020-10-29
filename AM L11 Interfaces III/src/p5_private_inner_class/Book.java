package p5_private_inner_class;

public class Book implements Comparable<Book>{
	private String title;
	private String isbn;
	private double price;
	private int copies;

	public Book(String title, String isbn, double price, int copies) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.copies = copies;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", price=" + price + ", copies=" + copies + "]";
	}

	@Override
	public int compareTo(Book o) {
//		return this.title.compareTo(o.title);
//		return Double.compare(this.price, o.price);
		return -(this.copies - o.copies);
	}

}
