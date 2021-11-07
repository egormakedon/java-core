/**
 * Expected: print method called from generic class.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main.A<String, Integer> a = new Main.A<>();
		a.setT1("Hello, World!");
		a.setT2(42);
		a.print();
	}

	private static class A <T1, T2 extends Number> {
		private T1 t1;
		private T2 t2;

		public void setT1(T1 t1) {
			this.t1 = t1;
		}

		public void setT2(T2 t2) {
			this.t2 = t2;
		}

		public void print() {
			System.out.printf("T1 parameter (%s) - %s\n", t1.getClass(), t1);
			System.out.printf("T2 parameter (%s) - %s\n", t2.getClass(), t2);
		}
	}
}