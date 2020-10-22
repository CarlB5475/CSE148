package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		int[] number = new int[10];
		double[] gpas = new double[10];
		String[] names = new String[10];
//		number[0] = 1;
//		number[1] = 5;
		
		ArrayList<String> list1 = new ArrayList<>();
		for(int i =0; i< 100; i++) {
			list1.add(String.valueOf(i));
		}
		
		System.out.println(list1);	
	}

}
