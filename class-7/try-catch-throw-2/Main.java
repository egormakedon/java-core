import java.io.IOException;

/**
 * Expected: try-catch-throw compiled error.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("try before throw");
			throw new IOException();
		} catch (IOException | RuntimeException e) {
			System.out.println("try after throw");
			e = new RuntimeException(e);
			e.printStackTrace();
		}
	}
}