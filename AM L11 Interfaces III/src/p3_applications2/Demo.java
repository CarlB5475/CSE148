package p3_applications2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
//		Integer i1 = 5;
//		Integer i2 = 1;
//		Integer i3 = 10;
//		
//		Integer[] arrInteger = {i1, i2, i3};
//		
//		System.out.println(Arrays.toString(arrInteger));
//		Arrays.sort(arrInteger);
//		System.out.println(Arrays.toString(arrInteger));
//		System.out.println("------------");
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(i1);
//		list.add(i2);
//		list.add(i3);
//		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		
		Book b1 = new Book("M", "ADZ123", 49.99, 5);
		Book b2 = new Book("a", "ZDZ123", 149.99, 15);
		Book b3 = new Book("Z", "MDZ123", 19.99, 1);
		
		Book[] arrBook = {b1, b2, b3};
		System.out.println(Arrays.toString(arrBook));
		Arrays.sort(arrBook);
		System.out.println(Arrays.toString(arrBook));
		
		
	}

}
