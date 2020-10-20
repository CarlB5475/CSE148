package p4;

import p1.Bank;
import p2.CheckingAccount;
import p3.SavingsAccount;

public class BankBag {
	private Bank[] arr;
	private int nElems;
	
	public BankBag(int maxSize) {
		arr = new Bank[maxSize];
	}
	
	public Bank removeCheckingAccountByPosition(int position) {
		int counter = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof CheckingAccount) {
				counter++;
				if (counter == position) {
					int index = arr[i].getId();
					Bank temp = removeById(index);
					return temp;
				}
			}
		}
		return null;
	}
	
	public Bank removeSavingsAccountByPosition(int position) {
		for (int i = 0; i < nElems; i++) {
			int counter = 0;
			if (findById(i) instanceof SavingsAccount) {
				counter++;
				if (counter == position) {
					Bank temp = removeById(i);
					return temp;
				}
			}
		}
		return null;
	}
	
	public void insert(Bank bankAccount) {
		arr[nElems++] = bankAccount;
	}
	
	public Bank findById(int id) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getId() == id) {
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
	
	public Bank removeById(int id) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(arr[i].getId() == id) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Bank temp = arr[i];
			for(int j = i; j < nElems-1; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public int getNumberOfAccounts() {
		return nElems;
	}
}
