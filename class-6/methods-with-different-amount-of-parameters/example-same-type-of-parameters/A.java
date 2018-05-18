public class A {
	public static void main(String[] args) {
		print(0,1);
		print(0,1,2,3);
		print(-1);
	}

	private static void print(int ... args) {
		for (int index = 0; index < args.length; index++) {
			System.out.print(args[index] + " ");
		}
		System.out.print("\n");
	}
}