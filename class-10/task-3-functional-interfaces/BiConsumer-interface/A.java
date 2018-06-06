import java.util.function.*;

public class A {
	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer = (String s, Integer i) -> {
			for (int j = 0; j < i; j++) {
				System.out.println(s);
			}
		}; 	

		biConsumer.accept("Hello, World!", 5);
		biConsumer.accept("EPAM SYSTEMS", 10);
	}
}