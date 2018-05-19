public class A {
	static class OwnException extends RuntimeException {
		public OwnException(String s) {
			super(s);
		}
	}

	public static void main(String[] args) {
		throw new A.OwnException("Own RuntimeException");
	}
}