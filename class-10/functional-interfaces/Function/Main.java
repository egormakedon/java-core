import java.util.function.Function;

/**
 * Expected: used function.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Function<Integer, Double> function = x -> x.doubleValue() / 2;

		System.out.println(function.apply(2));
		System.out.println(function.apply(5));
		System.out.println(function.apply(42));
		System.out.println(function.apply(1001));
		System.out.println(function.apply(0));
	}
}