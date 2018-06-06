import java.util.*;

public class A {

	@FunctionalInterface
	interface OwnFunctionalInterface {
		void print(String s);

		default void default1() {
			System.out.println("default1");
		}

		default void default2() {
			System.out.println("default2");
		}

		static void static1() {
			System.out.println("static1");
		}

		static void static2() {
			System.out.println("static2");
		}
	}

	public static void main(String[] args) {
		System.out.println("several implementations using both lambda expressions");
		method(s -> System.out.println(s), "Hello, World!!");
		method(s -> {
			s = s.trim();
			s = s.substring(7);
			System.out.println(s);
		}, "        Hello, World!!             ");

		System.out.print("\n");

		System.out.println("several implementations using inner anonymous classes and default methods");

		callDefault(new OwnFunctionalInterface() {
			@Override
			public void print(String s) {
				//
			}
		});

		System.out.println("---");

		callDefault(new OwnFunctionalInterface() {
			@Override
			public void print(String s) {
				//
			}

			@Override
			public void default1() {
				System.out.println("overrides default1");
			}

			@Override
			public void default2() {
				System.out.println("overrides default2");
			}
		});

		System.out.print("\n");

		System.out.println("call static methods");

		OwnFunctionalInterface.static1();
		OwnFunctionalInterface.static2();
	}

	private static void method(OwnFunctionalInterface f, String s) {
		f.print(s);
	}

	private static void callDefault(OwnFunctionalInterface f) {
		f.default1();
		f.default2();
	}
}