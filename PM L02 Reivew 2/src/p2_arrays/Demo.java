package p2_arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = new int[10]; // new is used to create an object

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;

		for (int n : numbers) { // for each loop
			System.out.println(n * 2);
		}
		
		int[] integers = numbers; // shallow copy
		integers[0] = 99;
		
		System.out.println(numbers[0]);
		
	}

}
