package p5;

import p1.Bank;
import p2.CheckingAccount;
import p3.SavingsAccount;
import p4.BankBag;

public class Demo {

	public static void main(String[] args) {
		BankBag theBag = new BankBag(100);

		Bank checkingA = new CheckingAccount("A", 100);
		Bank checkingB = new CheckingAccount("B", 200);
		Bank savingsA = new SavingsAccount("C", 300);
		Bank savingsB = new SavingsAccount("D", 400);

		theBag.insert(savingsB);
		theBag.insert(checkingB);
		theBag.insert(savingsA);
		theBag.insert(checkingA);
		// 5.1
		theBag.display();
//		
		// 5.2
		theBag.removeCheckingAccountByPosition(2);
		theBag.display();



	}

}
