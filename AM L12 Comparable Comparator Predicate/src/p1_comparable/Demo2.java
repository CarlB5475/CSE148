package p1_comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		String[] names = {"B", "D", "Z", "C", "A"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		Integer[] numbers = {5, 9, 2, 4, 1, 8};
		
//		int[] numbersCopy = numbers; // shallow copy
		
//		
//		int[] numbersDeepCopy = new int[numbers.length];
//		for(int i = 0; i < numbers.length; i++) {
//			numbersDeepCopy[i] = numbers[i];
//		}
		
//		int[] numbersDeepCopy = Arrays.copyOf(numbers, numbers.length);
//		
//		Arrays.sort(numbersDeepCopy);
//		
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(numbersDeepCopy));
		
//		List<Integer> numberList = Arrays.asList(numbers);
//		Collections.sort(numberList);
		
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for(int i = 0; i < numbers.length; i++) {
			numberList.add(numbers[i]);
		}
		
		Collections.sort(numberList);
		System.out.println(numberList);
		
	}

}
