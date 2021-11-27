/**
 * Expected: functional interface, 55.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		method(() -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			return sum;
		}); 
	}

	private static void method(CountInterface i) {
		System.out.println(i.count());
	}

	@FunctionalInterface
	interface CountInterface {
		int count();
	}
}