/**
 * Expected: unexpected type.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main.A<int> a = new Main.A<>();
	}

	private static class A <T> {
		private T t;
	}
}