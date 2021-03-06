package p6;

import p5.Student;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public void insert(Student student) {
		arr[nElems++] = student;
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
