package p2_comparator_annonymous_class;

import java.util.Arrays;
import java.util.Comparator;

public class BookArrayBag {
	private Book[] arr;
	private int nElems;
	
	public BookArrayBag(int maxSize) {
		arr = new Book[maxSize];
	}
	
	public void insert(Book book) {
		arr[nElems++] = book;
	}
	public Book[] sort() {
		Book[] tempArr = Arrays.copyOf(arr, nElems);
		Arrays.sort(tempArr);
		return tempArr;
	}
	public Book[] sort(Comparator<Book> comparator) {
		Book[] tempArr = Arrays.copyOf(arr, nElems);
		Arrays.sort(tempArr, comparator);
		return tempArr;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
