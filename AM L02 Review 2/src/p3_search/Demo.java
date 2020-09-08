package p3_search;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		
		for(int n  : numbers) {
			System.out.print(n + " ");
		}
	}

}
