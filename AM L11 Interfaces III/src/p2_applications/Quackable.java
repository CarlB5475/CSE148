package p2_applications;

public interface Quackable {
	public default void quack() {
		System.out.println("Quack...");
	}
}
