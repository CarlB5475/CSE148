package p1_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
//		Integer n1 = 1;
//		Integer n2 = 2;
//		Integer n3 = 3;
//		Integer n4 = 4;
//		
//		Integer[] arr1 = {n1, n4, n3, n2};
//		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
		
//		String[] arr2 = {"Z", "A", "G", "M"};
//		System.out.println(Arrays.toString(arr2));
//		Arrays.sort(arr2);
//		System.out.println(Arrays.toString(arr2));
		
//		Person[] arr3 = {new Person("Z", 10), new Person("A", 5), new Person("M", 20)};
//		System.out.println(Arrays.toString(arr3));
//		Arrays.sort(arr3);
//		System.out.println(Arrays.toString(arr3));
		
		ArrayList<Person> list1 = new ArrayList<> ();
		list1.add(new Person("Z", 10));
		list1.add(new Person("A", 5));
		list1.add(new Person("M", 30));
		list1.add(new Person("C", 3));
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
