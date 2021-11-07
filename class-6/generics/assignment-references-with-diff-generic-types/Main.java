/**
 * Expected: incompatible types: A<Integer> cannot be converted to A<String>.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main.A<String> a1 = new Main.A<>();
		Main.A<Integer> a2 = new Main.A<>();
		a1 = a2;
	}

	private static class A <T> {
		private T t;
	}
}