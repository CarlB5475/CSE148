package p7_lambda_expression;

import java.util.Arrays;

public class PredicateDemo {

	public static void main(String[] args) {
		Book b1 = new Book("M", "MDZ123", 39.99, 5);
		Book b2 = new Book("A", "ZDZ123", 19.99, 15);
		Book b3 = new Book("Z", "MDZ123", 29.99, 1);

		BookBag theBag = new BookBag(100);
		theBag.insert(b1);
		theBag.insert(b2);
		theBag.insert(b3);
		
		Book[] arr = theBag.search((b) -> {
			return ((Book)b).getPrice() == 19.99 || ((Book)b).getTitle().equals("M");
		});
		
		System.out.println(Arrays.toString(arr));
	}

}
