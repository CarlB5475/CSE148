package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(2); // autoboxing
		numberList.add(1); // autoboxing
		numberList.add(9); // autoboxing
		numberList.add(6); // autoboxing
		numberList.add(3); // autoboxing
		numberList.add(5); // autoboxing
		numberList.add(7); // autoboxing
		numberList.add(8); // autoboxing
		System.out.println(numberList); // auto-unboxing
		Collections.sort(numberList);
		System.out.println(numberList); // auto-unboxing
		System.out.println();
		
		int[] numbers = {3, 6, 9, 0, 4, 7, 2, 1};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("Sort Strings");
		String[] names = {"John", "Adam", "Billy", "Zack"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}

}
