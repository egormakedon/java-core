public class A {
	public static void main(String[] args) {
		char[] c = {'1','%','!'};
		print(1.1d, c, 0, 1, 2, 3, 4, 5);
		print(1.1d, c, 0, 1, 2, 3);
	}

	private static void print(double p1, char[] c, int ... args) {
		System.out.println("Double p1 - " + p1);

		System.out.print("char array c - ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("\n");

		System.out.print("int array args - ");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.print("\n");
	}
}