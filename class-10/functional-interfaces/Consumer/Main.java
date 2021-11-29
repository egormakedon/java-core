import java.util.function.Consumer;

/**
 * Expected: used consumer.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Consumer<Person> consumer = p -> System.out.printf("%s - good person!\n", p);

		consumer.accept(new Person("Yahor"));
		consumer.accept(new Person("Viktoriya"));
	}

	private static class Person {
		private String name;

		public Person(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}