package p4;

import java.util.Arrays;
import java.util.function.Predicate;

import p1.Animal;
import p2.Wolf;

public class AnimalBag {
	private Animal[] arr;
	private int nElems;

	public AnimalBag(int maxSize) {
		arr = new Animal[maxSize];
	}

	public void insert(Animal animal) {
		arr[nElems++] = animal;
	}

//	public Animal findById(int id) {
//		for (int i = 0; i < nElems; i++) {
//			if (arr[i].getId() == id) {
//				return arr[i];
//			}
//		}
//		return null;
//	}

	public Animal[] find(Predicate predicate) {
		Animal[] tempArr = new Animal[nElems];
		int matchCounter = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				tempArr[matchCounter++] = arr[i];
			}
		}

		return Arrays.copyOf(tempArr, matchCounter);
	}

	public void display(Predicate predicate) {
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
	}

	public Animal removeById(int id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getId() == id) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Animal temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public Animal findWolfByPosition(int position) {
		int counter = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof Wolf) {
				counter++;
				if (counter == position) {
					return arr[i];
				}
			}
		}
		return null;
	}
}
