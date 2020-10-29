package p2_applications;

public abstract class Duck {
	private String species;
	private String gender;

	public Duck(String species, String gender) {
		super();
		this.species = species;
		this.gender = gender;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
//	public void fly() {
//		System.out.println("Fly...");
//	}
//	
//	public void swim() {
//		System.out.println("Swim...");
//	}
//	
//	public void Quack() {
//		System.out.println("Quack...");
//	}

	@Override
	public String toString() {
		return "Duck [species=" + species + ", gender=" + gender + "]";
	}

}
