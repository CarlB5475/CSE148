package hw4_1;

public class PersonBag {
	private Person[] arr;
	private int nElems;

	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
	}

	// overloaded methods
	public void insert(Person person) {
		arr[nElems++] = person;
	}

	public Person removeById(String id) {
		int i;
		for (i = 0; i < nElems - 1; i++) {
			if (arr[i].getId().equals(id)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Person temp = arr[i];
			for (int j = i; j < nElems; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}

	public Person findById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getId().equals(id)) {
				return arr[i];
			}
		}
		return null;
	}
}
