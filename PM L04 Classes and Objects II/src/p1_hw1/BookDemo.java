package p1_hw1;

public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new Book("Java", "1234567", 10, 99.99);// arguments
		Book b2 = new Book("OOP", "321456", 5, 199.99);
		Book b3 = new Book("HTML", "9876543", 20, 59.99);

		Book[] bookArray = new Book[3];
		bookArray[0] = b1;
		bookArray[1] = b2;
		bookArray[2] = b3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
//		//display
//		System.out.printf("%-10S%15s%10s%10S%n", "Title", "ISBN", "COPIES", "Price");
//		for (Book b : bookArray) {
//			System.out.printf("%-10s%15s%10d%10.2f%n", b.getTitle(), b.getIsbn(), b.getNumberOfCopies(), b.getPrice());
//		}
		
//		System.out.println(b1.getTitle() + ": " + b1.getIsbn() +
//				", " + b1.getNumberOfCopies() + ", " + b1.getPrice());
//		
//		System.out.println(b2.getTitle() + ": " + b2.getIsbn() +
//				", " + b2.getNumberOfCopies() + ", " + b2.getPrice());
//		System.out.println(b3.getTitle() + ": " + b3.getIsbn() +
//				", " + b3.getNumberOfCopies() + ", " + b3.getPrice());
		
		//		System.out.println(Book.getTotal());
//		Book.setTotal(200);
//		System.out.println(Math.sqrt(4));
//		
//		Book b1 = new Book();
//		b1.setTitle("Java");
//		b1.setIsbn("123");
//		b1.setNumberOfCopies(10);
//		b1.setPrice(99.99);
//		System.out.println(b1.getTitle() + ": " + b1.getIsbn() +
//				", " + b1.getNumberOfCopies() + ", " + b1.getPrice());
//		System.out.println(b1.getTotal());
//		System.out.println();
//		
//		Book b2 = new Book();
//		b2.setTitle("OOP");
//		b2.setIsbn("321");
//		b2.setNumberOfCopies(5);
//		b2.setPrice(199.99);
//		System.out.println(b2.getTitle() + ": " + b2.getIsbn() +
//				", " + b2.getNumberOfCopies() + ", " + b2.getPrice());
//		System.out.println(b2.getTotal());
//		
//		Book b3 = new Book();
//		System.out.println(b3.getTotal());
	}

}
