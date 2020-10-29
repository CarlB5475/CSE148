package p1_review;

public class Demo {

	public static void main(String[] args) {
		Doer d1 = new Doer("A", 5);
		d1.doThis();
		d1.doThat();
		d1.doDefault();
		
		Doable.doStatic();
	}

}
