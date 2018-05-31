import java.util.function.Predicate;

public class A {
	public static void main(String[] args) {
		Predicate<Integer> predicate = x -> x > 0;
		System.out.println(predicate.test(5));
		System.out.println(predicate.test(-1));
	}
}