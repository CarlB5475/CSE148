package p4_predicate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class BookArrayBag {
	private Book[] arr;
	private int nElems;
	
	public BookArrayBag(int maxSize) {
		arr = new Book[maxSize];
	}
	
	public void insert(Book book) {
		arr[nElems++] = book;
	}
	
	public Book[] sort(Comparator<Book> comparator) {
		Book[] tempArr = Arrays.copyOf(arr, nElems);
		Arrays.sort(tempArr, comparator);
		return tempArr;
	}
	
	public Book[] search(Predicate<Book> predicate) {
		Book[] tempArr = new Book[nElems];
		int matchCount =0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
			}
		}
		
		return Arrays.copyOf(tempArr, matchCount);
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
