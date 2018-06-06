import java.util.function.Supplier;

public class A {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> {
			Integer i = 42;
			return 42;
		}; 
		System.out.println(supplier.get());
	}
}