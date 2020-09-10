package p1_classes;

public class Cat { // public: access modifier. Class header
	
	// instance variables, fields, instance fields, attributes, properties
	// describing state
	private int age; // the variable age is only visible inside this class
	private String name;
	private boolean isMale;
	
	// behavior, methods, instance methods
	public void jump() { // header of method
		System.out.println(name + " is jumping!");
	}
	
	public int grow() {
		age = age + 1;
		return age;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setIsMale(boolean gender) {
		if (gender == true) {
			isMale = true;
		} else {
			isMale = false;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getGender() {
		return isMale;
	}
}
