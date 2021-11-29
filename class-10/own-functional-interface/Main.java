import java.util.*;

/**
 * Expected: used own functional interface with different methods.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		callPrint(s -> System.out.println(s), "Hello, World!");

		callPrint(s -> {
			s = s.trim().substring(7);
			System.out.println(s);
		}, "        Hello, World!             ");

		callDefault(new OwnFunctionalInterface() {
			@Override
			public void print(String s) {
			}
		});

		callDefault(new OwnFunctionalInterface() {
			@Override
			public void print(String s) {
			}

			@Override
			public void default1() {
				System.out.println("Override default1");
			}

			@Override
			public void default2() {
				System.out.println("Override default2");
			}
		});

		OwnFunctionalInterface.static1();
		OwnFunctionalInterface.static2();
	}

	private static void callPrint(OwnFunctionalInterface i, String s) {
		i.print(s);
	}

	private static void callDefault(OwnFunctionalInterface i) {
		i.default1();
		i.default2();
	}

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
}