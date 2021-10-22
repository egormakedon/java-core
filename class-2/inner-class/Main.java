/**
 * Expected: classes compiled and run.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(new Main().new A());
		System.out.println(new Main().new B());
		System.out.println(new Main().new C());
	}

	public class A {
		@Override
		public String toString() {
			return "Inner class A - Main$A.class";
		}
	}

	public class B {
		@Override
		public String toString() {
			return "Inner class B - Main$B.class";
		}
	}

	public class C {
		@Override
		public String toString() {
			return "Inner class C - Main$C.class";
		}
	}
}