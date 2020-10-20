package p1;

public abstract class Bank {
	private String customerName;
	private int id;

	private static int idCounter = 0;

	public Bank(String customerName) {
		this.customerName = customerName;
		id = idCounter++;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getId() {
		return id;
	}

	public void deposit(double amount) {

	}

	public void withdraw(double amount) {

	}

	@Override
	public String toString() {
		return "Bank [customerName=" + customerName + ", id=" + id + "]";
	}

}
