package p3_inheritance_II;

public class PersonBag {
	private Person[] arr;
	private int nElems;

	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
		nElems = 0;
	}

	public Person deleteById(String id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getId().contentEquals(id)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Person temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public void insert(Person person) {
		arr[nElems++] = person;
	}

	public Person searchById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getId().contentEquals(id)) {
				return arr[i];
			}
		}
		return null;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof Student) {
				System.out.println("Student---" + arr[i]);

			} else {
				System.out.println("Professor---" + arr[i]);
			}
		}
		System.out.println();
	}
}
