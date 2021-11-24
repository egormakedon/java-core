/**
 * Expected: compilied and run successfully.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try (A a = new A();) {
			a.print();
			throw new IllegalStateException("Main class - try block - IllegalStateException");
		} catch (IllegalStateException e) {
			System.out.printf("Main class - catch block - [%s]\n", e.getMessage());

			for (Throwable t : e.getSuppressed()) {
				System.out.printf("Main class - catch block - [%s]\n", t.getMessage());
			}
		} finally {
			System.out.println("Main class - finally block");
		}
	}
}