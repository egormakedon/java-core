import java.util.function.BinaryOperator;

/**
 * Expected: used binaryOperator.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;

		System.out.println(binaryOperator.apply(10, 5));
		System.out.println(binaryOperator.apply(-1, 42));
		System.out.println(binaryOperator.apply(0, 1001));
	}
}