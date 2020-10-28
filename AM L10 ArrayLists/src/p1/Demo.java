package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(new Person("A", 1)); // autoboxing: box primitive 1 into an Integer object
		list1.add(1);
		list1.add("hi");
//		String[] arr = new String[100];
//		ArrayList<String> list1 = new ArrayList<>(); // store objects only
//		
//		for (int i = 0; i < 10; i++) {
//			list1.add("" + i);
//		}
//		list1.add(1, "100");
//		list1.set(1, "A");
		
//		list1.remove(1);
		
//		System.out.println(list1.contains("2"));
	}

}
