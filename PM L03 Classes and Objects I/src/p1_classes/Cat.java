package p1_classes;

public class Cat { // public: access modifier. nothing: package access/default access
	// private: these variables visible to objects of this class only
	// used to store values for an individual object
	
	
	// variables to describe the state of an object
	// instance variables, fields, instance fields, properties, attributes
	private String name;
	private boolean isMale;
	private int age;
	
	//class variables or static variables
	private static String category = "Cat";
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String newCategory) {
		category = newCategory;
	}
	// behavior, methods
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setIsMale(boolean gender) {
		isMale = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getGender() {
		return isMale;
	}
	
	public int getAge() {
		return age;
	}
	
	public void jump() {
		System.out.println(name + " is jumping!");
	}
	
	public int grow(int years) {
		age = age + years;
		return age;
	}
}
