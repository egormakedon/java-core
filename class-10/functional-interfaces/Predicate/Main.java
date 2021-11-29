import java.util.function.Predicate;

/**
 * Expected: used predicate.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Predicate<Integer> predicate = x -> x > 0;

		System.out.println(predicate.test(5));
		System.out.println(predicate.test(-1));
		System.out.println(predicate.test(0));
		System.out.println(predicate.test(42));
		System.out.println(predicate.test(-42));
	}
}