package p1;

public class StudentBagMachine {
	private Student[] arr;
	private int nElems;
	private int maxSize;
	
	public StudentBagMachine(int maxSize) {
		this.maxSize = maxSize;
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	// overloaded methods
	public void insert(Name name, String phone, double gpa, String major) {
		Student s = new Student(name, phone, gpa, major);
		arr[nElems++] = s;
	}
	
	public void insert(String firstName, String lastName, String phone, double gpa, String major) {
		Student s = new Student(firstName, lastName, phone, gpa, major);
		arr[nElems++] = s;
	}
	
	public void insert(Name name) {
		Student s = new Student(name);
		arr[nElems++] = s;
	}
	
	public void insert(Student student) {
		arr[nElems++] = student;
	}
	
	public void insert(String firstName, String lastName) {
		Student s = new Student(firstName, lastName);
		arr[nElems++] = s;
	}
	
	public Student deleteById(String id) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(arr[i].getId().contentEquals(id)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Student temp = arr[i];
			for(int j = i; j< nElems-1; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	
	public Student searchById(String id) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getId().contentEquals(id)) {
				return arr[i];
			}
		}
		return null;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
