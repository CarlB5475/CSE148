package p2_comparator_annonymous_class;

public class Book implements Comparable<Book>{
	private String title;
	private String isbn;
	private double price;

	public Book(String title, String isbn, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.isbn.compareTo(o.isbn);
//		return Double.compare(this.price, o.price);
	}

}
