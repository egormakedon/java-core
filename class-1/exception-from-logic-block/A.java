public class A {
	private static int i;
	{
		if (i == -1) {
			i = 0;
		} else {
		throw new RuntimeException("Hello, World!");
	}
	}

	public static void main(String[] args) {
		if (args.length != 0) {
			i = -1;
		} 
		new A();
	}
}