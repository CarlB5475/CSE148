package p2;

import p1.Animal;

public class Wolf extends Animal {
	private int packSize;

	public Wolf(String name, double age, int packSize) {
		super(name, age);
		this.packSize = packSize;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Howl");
	}
	
	@Override
	public void grow(int number) {
		packSize += number;
	}

	public int getPackSize() {
		return packSize;
	}

	public void setPackSize(int packSize) {
		this.packSize = packSize;
	}

	@Override
	public String toString() {
		return "Wolf [Name=" + getName() + ", ID=" + getId() + ", Pack Size=" + packSize + "]";
	}
	
	
}
