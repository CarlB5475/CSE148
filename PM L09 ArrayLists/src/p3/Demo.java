package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Cathy", 4.0);
		Student s2 = new Student("Billy", 2.5);
		Student s3 = new Student("Frankie", 3.5);
		Student s4 = new Student("Sammy", 1.5);
		
		ArrayList<Student> myList = new ArrayList<>();
		myList.add(s1);
		myList.add(s2);
		myList.add(s3);
		myList.add(s4);
		
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
		
		
		System.out.println();
		
		
		Student[] students = {s1, s2, s3, s4};
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
	}

}
