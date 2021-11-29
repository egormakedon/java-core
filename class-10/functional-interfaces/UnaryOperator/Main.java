import java.util.function.UnaryOperator;

/**
 * Expected: used unaryOperator.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		UnaryOperator<Integer> increment = x -> ++x;

		System.out.println(increment.apply(0));
		System.out.println(increment.apply(10));
		System.out.println(increment.apply(41));
		System.out.println(increment.apply(1000));
		System.out.println(increment.apply(-1));
	}
}