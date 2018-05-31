import java.util.function.Function;

public class A {
	public static void main(String[] args) {
		Function<Integer,Double> divideOnTwo = x -> {
			Double result = (double) x / 2;
			return result;
		};
		System.out.println(divideOnTwo.apply(2));
		System.out.println(divideOnTwo.apply(5));
	}
}