import java.util.*;

public class A {
	public static void main(String[] args) {
		Object o = null;
		method1(o);

		String s = (String) method2(o);
		System.out.println(s);

		method3(o);
	}

	private static void method1(Object o) {
		Optional<Object> opt = Optional.ofNullable(o);
		opt.orElse(new Object());
	}

	private static Object method2(Object o) {
		Optional<Object> opt = Optional.ofNullable(o);
		return opt.orElseGet(() -> new String("orElseGet method"));
	}

	private static void method3(Object o) {
		Optional<Object> opt = Optional.ofNullable(o);
		opt.orElseThrow(() -> new RuntimeException("orElseThrow method"));
	}
}