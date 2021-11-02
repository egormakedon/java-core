/**
 * Expected: java.lang.OutOfMemoryError: Java heap space.
 * 
 * @author Yahor Makedon
 */
public class Main {
	private A a = new A();

	public static void main(String[] args) {
		new Main().start();
	}

	public void start() {
		while (true) {
			A a1 = new A(a);
			a = a1;
		}
	}

	private class A {
		private A a;
		private B b;
		private String s = new String(toString() + hashCode());

		public A() {
		}

		public A(A a) {
			this.a = a;
			b = new B(this, a);
			s = new String(s + a.getS() + b.getS());
		}

		public A getA() {
			return a;
		}

		public B getB() {
			return b;
		}

		public String getS() {
			return s;
		}

		private class B {
			private A a1;
			private A a2;
			private String s = new String(toString() + hashCode());

			public B(A a1, A a2) {
				this.a1 = a1;
				this.a2 = a2;
				s = new String(s + a1.getS() + a2.getS());
			}

			public A getA1() {
				return a1;
			}

			public A getA2() {
				return a2;
			}

			public String getS() {
				return s;
			}
		}
	}
}