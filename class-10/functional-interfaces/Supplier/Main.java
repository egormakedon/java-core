import java.util.function.Supplier;

/**
 * Expected: used supplier.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 42;
		System.out.println(supplier.get());
	}
}