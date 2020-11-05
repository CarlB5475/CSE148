package p1_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		BookArrayBag arrBag = new BookArrayBag(1000);
		Book b1 = new Book("A", "999", 49.00);
		Book b2 = new Book("Z", "555", 19.00);
		Book b3 = new Book("M", "111", 99.00);
		arrBag.insert(b1);
		arrBag.insert(b2);
		arrBag.insert(b3);
		
		arrBag.display();
		Book[] newSortedArr = arrBag.sort();
		System.out.println("Sorted by Price as in Comparable: " + Arrays.toString(newSortedArr));
		
		Book[] sortedArr = arrBag.sort(new Demo().new MyComparator());
		
//		arrBag.display();
//		System.out.println("The sorted array is: ");
		System.out.println("Sorted by title as in Comparator: " + Arrays.toString(sortedArr));
		
	}
	
	private class MyComparator implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getTitle().compareTo(o2.getTitle());
//			return Double.compare(o1.getPrice(), o2.getPrice());
		}
		
	}

}
