public class A {
	public static void main(String[] args) {
		A a = new A();
		a.print("Hello, World!");
		a.print(42);
	}

	private <T> void print(T t) {
		if (t instanceof String) {
 			System.out.println("String T - " + t);
 		} else if (t instanceof Integer) {
 			int value = (Integer) t;
 			value++;
 			System.out.println("Integer T - before incrementing: " + t + ", after incrementing: " + value);
 		} else {
 			throw new RuntimeException("Wrong parameter T - only String or Integer types)");
 		}
	}
}