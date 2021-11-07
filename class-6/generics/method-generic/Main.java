/**
 * Expected: generic method parameterized by String and Integer types.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.print("Hello, World!");
		m.print(42);
	}

	private <T> void print(T t) {
		if (t instanceof String) {
			System.out.printf("String T - %s\n", t);
		} else if (t instanceof Integer) {
			Integer value = (Integer) t;
			value++;
			System.out.printf("Integer T - %s [before increment], %s [after increment]\n", t, value);
		} else {
			throw new RuntimeException("Wrong parameter T - only String or Integer types");
		}
	}
}