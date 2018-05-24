public class Main {
	public static void main(String[] args) {
		try(A a = new A();) {
			a.print();
			throw new IllegalStateException("Main class - IllegalStateException");
		} catch(IllegalStateException e) {
			System.out.println(e.getMessage());

			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		} finally {
			System.out.println("Main class - finally block");
		}
	}
}