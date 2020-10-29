package p2_applications;

public interface Flyable {
	public default void fly() {
		System.out.println("Fly...");
	}
}
