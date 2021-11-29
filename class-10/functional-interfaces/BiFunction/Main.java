import java.util.function.*;

/**
 * Expected: used biFunction.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (i1, i2) -> String.valueOf(i1 + i2);

		System.out.printf("Result - %s\n", biFunction.apply(1, 2));
		System.out.printf("Result - %s\n", biFunction.apply(5, 1));
		System.out.printf("Result - %s\n", biFunction.apply(5, 7));
		System.out.printf("Result - %s\n", biFunction.apply(42, 0));
		System.out.printf("Result - %s\n", biFunction.apply(9, 5));
	}
}