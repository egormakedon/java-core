/**
 * Expected: java.lang.StackOverflowError.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) throws Exception {
		new Main().a();
	}

	private void a() {
		b();
	}

	private void b() {
		c();
	}

	private void c() {
		a();
	}
}