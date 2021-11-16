/**
 * Expected: try-catch-throw.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("try before throw");
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("catch after throw");
			e = new RuntimeException(e);
			e.printStackTrace();
		}
	}
}