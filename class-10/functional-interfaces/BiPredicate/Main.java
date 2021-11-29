import java.util.function.*;

/**
 * Expected: used biPredicate.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> i1 > i2;

		System.out.println(biPredicate.test(1, 1));
		System.out.println(biPredicate.test(3, 1));
		System.out.println(biPredicate.test(-1, 100));
		System.out.println(biPredicate.test(42, 40));
		System.out.println(biPredicate.test(-1, 0));
	}
}