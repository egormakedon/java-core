public class A {
	public static void main(String[] args) {
		method(() -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			return sum;
		}); 
	}

	private static void method(OwnInterface i) {
		System.out.println(i.count());
	}

	@FunctionalInterface
	interface OwnInterface {
		int count();
	}
}