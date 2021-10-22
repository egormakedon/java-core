/**
 * Expected: classes compiled and run.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(new Main.A());
		System.out.println(new Main.B());
		System.out.println(new Main.C());
	}

	public static class A {
		@Override
		public String toString() {
			return "Nested class A - Main$A.class";
		}
	}

	public static class B {
		@Override
		public String toString() {
			return "Nested class B - Main$B.class";
		}
	}

	public static class C {
		@Override
		public String toString() {
			return "Nested class C - Main$C.class";
		}
	}
}