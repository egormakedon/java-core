public class A {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			e = new RuntimeException();
			e.printStackTrace();
		}
	}
}