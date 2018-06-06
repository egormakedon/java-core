import java.util.function.UnaryOperator;

public class A {
	public static void main(String[] args) {
		UnaryOperator<Integer> increment = x -> ++x;
		System.out.println(increment.apply(0));
		System.out.println(increment.apply(10));
		System.out.println(increment.apply(41));
	}
}