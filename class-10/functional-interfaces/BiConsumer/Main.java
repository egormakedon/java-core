import java.util.function.*;

/**
 * Expected: used biConsumer.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer = (s, i) -> {
			for (int j = 0; j < i; j++) {
				System.out.println(s);
			}
		};

		biConsumer.accept("Hello, World!", 5);
		biConsumer.accept("EPAM SYSTEMS", 10);
	}
}