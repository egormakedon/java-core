import java.util.function.*;

public class A {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate = (a1,a2) -> a1 > a2;
		System.out.println(biPredicate.test(1,1));
		System.out.println(biPredicate.test(3,1));
		System.out.println(biPredicate.test(-1,100));
	}
}