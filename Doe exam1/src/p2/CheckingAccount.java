package p2;

import p1.Bank;

public class CheckingAccount extends Bank {

	private double balance;

	public CheckingAccount(String customerName, double balance) {
		super(customerName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("There is not enough to withdraw " + amount);
		}
	}

	@Override
	public String toString() {
		return "CheckingAccount [CustomerName=" + getCustomerName() + ", ID=" + getId() + ", Balance=" + balance + "]";
	}

}
