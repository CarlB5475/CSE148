package p4_predicate;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		BookArrayBag arrBag = new BookArrayBag(100);
		Book b1 = new Book("M", "999", 49.00);
		Book b2 = new Book("Z", "555", 19.00);
		Book b3 = new Book("M", "111", 19.00);
		arrBag.insert(b1);
		arrBag.insert(b2);
		arrBag.insert(b3);
		
//		arrBag.display();
		
		Book[] matchedBooks = arrBag.search((Book b) -> {
			return b.getTitle().equals("M") && b.getPrice() == 19.00;
		});
		
		System.out.println(Arrays.toString(matchedBooks));
	}
	
}

