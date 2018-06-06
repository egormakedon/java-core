import java.util.function.*;

public class A {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,String> biFunction = (a1, a2) -> {
			return String.valueOf(a1 + a2);
		};

		System.out.println("Result - " + biFunction.apply(1,2));
		System.out.println("Result - " + biFunction.apply(5,1));
		System.out.println("Result - " + biFunction.apply(5,7));
	}
}