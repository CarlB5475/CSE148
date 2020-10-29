package p7_lambda_expression;

import java.util.Arrays;
import java.util.function.Predicate;

public class BookBag {
	private Book[] arr;
	private int nElems;
	
	public BookBag(int maxSize) {
		arr = new Book[maxSize];
	}
	
	public void insert(Book book) {
		arr[nElems++] = book;
	}
	
	public Book[] search(Predicate predicate) {
		Book[] tempArr = new Book[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, matchCount);
	}
}
