/**
 * Expected: java.lang.StackOverflowError.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) throws Exception {
		new Main().start();
	}

	private void start() {
		start();
	}
}