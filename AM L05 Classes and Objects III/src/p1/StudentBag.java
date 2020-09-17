package p1;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public Student deleteById(String id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getId().contentEquals(id)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Student temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}

	}
	
	public void insert(Student student) {
		arr[nElems++] = student;
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
		System.out.println();
	}
}
