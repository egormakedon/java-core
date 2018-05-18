public class A {

	interface I <T> {
		void print(T t);
	}

	class B <T> implements I <T> {
		@Override
		public void print(T t) {
			System.out.println("Class B, T - " + t.getClass() + " - " + t.toString());
		}
	}

	class C <T> implements I <T> {
		@Override
		public void print(T t) {
			System.out.println("Class C, T - " + t.getClass() + " - " + t.toString());
		}
	}

	public static void main(String[] args) {
		A.I<String> b = new A().new B<>();
		A.I<Integer> c = new A().new C<>();

		b.print("Hello, World!");
		c.print(42);
	}
}