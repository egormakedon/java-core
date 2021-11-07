/**
 * Expected: printed different parameters.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		char[] c = {'1','%','!'};
		print(0.0d, c, 0, 1, 2, 3, 4, 5);
		System.out.print("\n");
		print(1.0d, c, 0, 1, 2, 3);
	}

	private static void print(double d, char[] c, int... args) {
		System.out.printf("Double - %.1f\n", d);

		System.out.print("Char array - ");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%s ", c[i]);
		}
		System.out.print("\n");

		System.out.print("Int array - ");
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%d ", args[i]);
		}
		System.out.print("\n");
	}
}