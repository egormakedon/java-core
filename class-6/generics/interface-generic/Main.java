/**
 * Expected: printed classes implement generic interface.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main.I<String> a = new Main.A<>();
		Main.I<Integer> b = new Main.B<>();

		a.print("Hello, World!");
		b.print(42);
	}

	private interface I <T> {
		void print(T t);
	}

	private static class A <T> implements I <T> {
		@Override
		public void print(T t) {
			System.out.printf("Class A, %s - %s\n", t.getClass(), t);
		}
	}

	private static class B <T> implements I <T> {
		@Override
		public void print(T t) {
			System.out.printf("Class B, %s - %s\n", t.getClass(), t);
		}
	}
}