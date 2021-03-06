package hw2_6_student_bag;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}
	
	// overloaded methods
	public void insert(Student student) {
		arr[nElems++] = student;
	}
	
	public Student removeById(String id) {
		int i;
		for(i = 0; i < nElems-1; i++) {
			if(arr[i].getId().equals(id)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Student temp = arr[i];
			for(int j = i; j < nElems; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void insert(String fn, String ln, String major, double gpa) {
		Student student = new Student(new Name(fn, ln), gpa, major);
		arr[nElems++] = student;
	}
	
	public Student findById(String id) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getId().equals(id)) {
				return arr[i];
			}
		}
		return null;
	}
}
