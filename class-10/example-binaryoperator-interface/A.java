import java.util.function.BinaryOperator;

public class A {
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;
		System.out.println(binaryOperator.apply(10,5));
		System.out.println(binaryOperator.apply(-1,42));
	}
}