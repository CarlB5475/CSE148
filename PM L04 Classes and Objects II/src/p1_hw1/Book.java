package p1_hw1;

public class Book {
	private String title;
	private String isbn;
	private int numberOfCopies;
	private double price;
	
	private static int total = 100;
	
	//overloaded constructors
	
	public static int getTotal() {
		return total;
	}

	public Book(String title) {
		this.title = title;
	}

	
	public Book() {
	}

	public Book(String title, String isbn, int numberOfCopies, double price) {
		this.title = title;
		this.isbn = isbn;
		this.numberOfCopies = numberOfCopies;
		this.price = price;
	}

	public static void setTotal(int total) {
		Book.total = total;
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

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", numberOfCopies=" + numberOfCopies + ", price=" + price
				+ "]";
	}

	
}
