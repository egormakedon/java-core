/**
 * Expected: generic class and method paratemerized with wildcard and super.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main.A<Integer> a1 = new Main.A<>(Integer.valueOf("0"));
		Main.A<Number> a2 = new Main.A<>(Double.valueOf("1.0"));
		Main.A<Object> a3 = new Main.A<>(new Object());

		a1.print(a1);
		a2.print(a2);
		a3.print(a3);
	}

	private static class A <T> {
		private T t;

		public A(T t) {
			this.t = t;
		}

		public T getT() {
			return t;
		}

		public void print(A<? super Integer> a) {
			System.out.printf("%s - %s\n", a.getT().getClass(), a.getT());
		}
	}
}