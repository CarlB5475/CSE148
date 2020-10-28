package p3;

import p1.Animal;

public class Dog extends Animal {
	private double weight;

	public Dog(String name, double age, double weight) {
		super(name, age);
		this.weight = weight;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Bark");
	}
	
	@Override
	public void grow(int number) {
		weight += number;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [Name=" + getName() + ", ID=" + getId() + ", Weight=" + weight + "]";
	}
	
	
}
