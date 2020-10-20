package p3;

import p1.Bank;

public class SavingsAccount extends Bank {
	private double balance;

	public SavingsAccount(String customerName, double balance) {
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
		return "SavingsAccount [Customer Name=" + getCustomerName() 
			+ ", ID=" + getId() + ", Balance=" + balance + "]";
	}

}
