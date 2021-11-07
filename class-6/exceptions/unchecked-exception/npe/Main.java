/**
 * Expected: java.lang.NullPointerException.
 * 
 * @author Yahor Makedon
 */
public class Main {
	private static String s;

	public static void main(String[] args) {
		s.intern();
	}
}