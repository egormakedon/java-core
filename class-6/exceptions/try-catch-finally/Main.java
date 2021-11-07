/**
 * Expected: try-catch-finally.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("try [before exception]");
			method();
			System.out.println("try [after exception] - never called");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}

	private static void method() throws Exception {
		throw new Exception();
	}
}