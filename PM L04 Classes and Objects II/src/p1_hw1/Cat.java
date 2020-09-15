package p1_hw1;

public class Cat {
	private String name;
	private double weight;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void feed(int foodAmount) {
		weight = weight + foodAmount/10.0;
	}

}
