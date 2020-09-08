package p2_arrays;

public class Demo {

	public static void main(String[] args) {
		int i = 10;
		char[] chars = new char[5];
		for(char n : chars) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		int[] numbers = new int[5];
		numbers[0] = 00;
		numbers[1] = 11;
		numbers[2] = 22;
		numbers[3] = 33;
		numbers[4] = 44;
		
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		
		int[] integers = numbers;
		integers[0] = 99;
		
		System.out.println();
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		
		
		System.out.println();
		
		numbers = null;
		integers = null;
		
		for(int n : integers) {
			System.out.print(n + " ");
		}
	}

}
