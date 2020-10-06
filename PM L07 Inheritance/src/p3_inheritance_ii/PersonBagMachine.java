package p3_inheritance_ii;

public class PersonBagMachine {
	private Person[] arr;
	private int nElems;
	private int maxSize;

	public PersonBagMachine(int maxSize) {
		this.maxSize = maxSize;
		arr = new Person[maxSize];
		nElems = 0;
	}

	public void insert(Person person) {
		arr[nElems++] = person;
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
			System.out.println(arr[i]);
		}
	}
}
