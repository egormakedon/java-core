public class A {
	public static void main(String[] args) {
		method();
	}

	private static void method() {
		try {
			System.out.println("try block");
			return;
		} finally {
			System.out.println("finally block after return");
		}
	}
}