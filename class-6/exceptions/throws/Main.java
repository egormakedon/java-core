/**
 * Expected: throws exception.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void method() throws Exception {
		throw new Exception("Throws Exception");
	}
}