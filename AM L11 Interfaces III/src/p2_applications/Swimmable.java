package p2_applications;

public interface Swimmable {
	public default void swim() {
		System.out.println("Swim...");
	}
}
