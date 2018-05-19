public class A {
	public static void main(String[] args) {
		try {
			method();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	

	private static void method() throws Exception {
		throw new Exception("Hello, World");
	}
}