/**
 * Expected: classes compiled and run.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		new Main().print();
		(new Main() {
			@Override
			public void print() {
				System.out.println("Hi, world! - Main$1.class");
			}
		}).print();
		(new Main() {
			@Override
			public void print() {
				System.out.println("World! - Main$2.class");
			}
		}).print();
	}

	public void print() {
		System.out.println("Hello, world! - Main.class");
	}
}