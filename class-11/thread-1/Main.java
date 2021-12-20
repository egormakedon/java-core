/**
 * Expected: thread created and started.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("Thread created and started."));
		t.start();
	}
}