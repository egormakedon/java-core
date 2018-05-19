public class A {
	public static void main(String[] args) {
		try {
			method();
			System.out.println("never used");
		} catch(Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
	}

	private static void method() throws Exception {
		throw new Exception();
	}
}