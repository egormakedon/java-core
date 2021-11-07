/**
 * Expected: printed parameters.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		print(0, 1);
		print(0, 1, 2, 3);
		print(-1, 0, 42);
		print(-42);
	}

	private static void print(int... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%d ", args[i]);
		}
		System.out.print("\n");
	}
}