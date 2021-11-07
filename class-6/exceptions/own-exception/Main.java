/**
 * Expected: thrown own exception.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		throw new Main.OwnException("Own RuntimeException");
	}

	private static class OwnException extends RuntimeException {
		public OwnException(String s) {
			super(s);
		}
	}
}